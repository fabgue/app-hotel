package fg.app.hotel.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fg.app.hotel.core.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>  {

	
	@Query("SELECT h.nombre FROM Hotel h WHERE h.id = :id")
	String findNombreById(@Param("id") Long id);
	
	List<Hotel> findByNombreLike(String nombre);
	
}
