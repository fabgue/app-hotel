package fg.app.hotel.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fg.app.hotel.core.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>  {

}
