package fg.app.hotel.core.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fg.app.hotel.core.dto.DemoResult;
import fg.app.hotel.core.entity.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long>  {

	
	@Query("SELECT d.nombre FROM Demo d WHERE d.id = :id")
	String findNombreById(@Param("id") Long id);
	
	List<Demo> findByNombreLike(String nombre);
	
	long countByIdCiudad(Long idCiudad);
	
	List<Demo> findByIdCiudadOrderByNombre(Long idCiudad);
	
	@Query(value = 
		" SELECT d.* FROM demo d INNER JOIN ciudad c on d.id_ciudad = c.id " + 
		" WHERE c.id_pais = :idPais ORDER BY d.nombre ", 
		nativeQuery= true)
	List<Demo> findByIdPais(@Param("idPais")Long idPais);
		
	@Query(
		value = 
			" select * from (select " + 
			" d.id as id, d.nombre as nombre, d.id_ciudad as  idCiudad, c.nombre as nombreCiudad, " + 
			" c.id_pais as idPais, p.nombre as nombrePais " + 
			" from demo d " + 
			" inner join ciudad c on d.id_ciudad = c.id " + 
			" inner join pais p on c.id_pais = p.id) d order by d.nombre",
		countQuery = 
			" select count(*) " + 
			" from demo d " + 
			" inner join ciudad c on d.id_ciudad = c.id " + 
			" inner join pais p on c.id_pais = p.id ", 
		nativeQuery = true)
	Page<DemoResult> findAllDemoPage(Pageable pageable);
	
}
