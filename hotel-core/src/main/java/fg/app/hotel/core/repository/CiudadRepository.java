package fg.app.hotel.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fg.app.hotel.core.entity.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long>  {

}
