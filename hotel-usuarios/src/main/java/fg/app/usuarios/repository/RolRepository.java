package fg.app.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fg.app.usuarios.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {

}
