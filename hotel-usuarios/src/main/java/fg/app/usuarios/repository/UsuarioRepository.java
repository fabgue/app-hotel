package fg.app.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fg.app.usuarios.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByLogin(String login);
	
	Usuario findByEmail(String email);

}
