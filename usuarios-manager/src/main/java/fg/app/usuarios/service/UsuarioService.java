package fg.app.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import fg.app.usuarios.dto.UsuarioDto;
import fg.app.usuarios.entity.Usuario;
import fg.app.usuarios.repository.UsuarioRepository;

public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public Usuario findByLogin(String login) {
		return usuarioRepository.findByLogin(login);
	}
	
	public Usuario createUsuario(UsuarioDto dto) {		
		Usuario usuario = new Usuario();
		usuario.setClave(bCryptPasswordEncoder.encode(dto.getClave()));
		usuario.setEmail(dto.getEmail());
		usuario.setLogin(dto.getLogin());
		usuario.setNombre(dto.getNombre());
		//usuario.setRoles(roles);
		return usuarioRepository.save(usuario);
	}
}
