package fg.app.hotel.core.repository;

import org.springframework.data.repository.CrudRepository;

import fg.app.hotel.core.entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Long>  {

}
