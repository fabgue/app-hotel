package fg.app.usuarios.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;


import fg.app.usuarios.entity.Rol;
import fg.app.usuarios.entity.Usuario;
import fg.app.usuarios.repository.UsuarioRepository;


public class DbUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        Usuario usuario = usuarioRepository.findByLogin(username);
        if (usuario == null) { 
        	throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Rol rol : usuario.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getLogin(), usuario.getClave(), grantedAuthorities);
    }
    
}
