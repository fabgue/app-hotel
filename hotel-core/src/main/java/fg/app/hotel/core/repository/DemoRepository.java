package fg.app.hotel.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fg.app.hotel.core.entity.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long>  {

	
	@Query("SELECT d.nombre FROM Demo d WHERE d.id = :id")
	String findNombreById(@Param("id") Long id);
	
	List<Demo> findByNombreLike(String nombre);
	
	long countByIdCiudad(Long idCiudad);
	
	List<Demo> findByIdCiudad(Long idCiudad);
	
	@Query(value = "SELECT d.* FROM demo d INNER JOIN ciudad c on d.id_ciudad = c.id WHERE c.id_pais = :idPais", nativeQuery= true)
	List<Demo> findByIdPais(@Param("idPais")Long idPais);
		
	
}
