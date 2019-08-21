package fg.app.hotel.core.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fg.app.hotel.core.entity.Hotel;
import fg.app.hotel.core.exception.ResourceNotFoundException;
import fg.app.hotel.core.repository.HotelRepository;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@GetMapping
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@GetMapping("/{id}")
	public Hotel getHotelById(@PathVariable Long id) {
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(Hotel.class, id));
	}
	
	@PostMapping
	public Hotel createHotel(@RequestBody Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@PutMapping("/{id}")
	public Hotel updateHotel(@PathVariable(value = "id") Long id, @RequestBody Hotel hotel) {
		Hotel hotelEdit = hotelRepository.findById(id).orElseThrow(
			() -> new ResourceNotFoundException(Hotel.class, id));
		hotelEdit.setNombre(hotel.getNombre());
		hotelEdit.setCiudad(hotel.getCiudad());
		// Faltan properties
		// Alternative verify Id and copyAllPropertiesNotNull
		return hotelRepository.save(hotelEdit);
	}	
	
	@DeleteMapping("/{id}")
	public Map<String,Object> deleteDemo(@PathVariable(value = "id") Long id) {
		Hotel hotelDelete = hotelRepository.findById(id).orElseThrow(
			() -> new ResourceNotFoundException(Hotel.class, id));
		hotelRepository.delete(hotelDelete);
        Map<String, Object> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;	
    }
	
}
