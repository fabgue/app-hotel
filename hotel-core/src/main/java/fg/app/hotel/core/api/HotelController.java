package fg.app.hotel.core.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fg.app.hotel.core.entity.Hotel;
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
		return hotelRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro no encontrado"));
	}
	
	@PostMapping
	public Hotel createHotel(@RequestBody Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@PutMapping("/{id}")
	public Hotel updateHotel(@PathVariable(value = "id") Long id, @RequestBody Hotel hotel) {
		return hotelRepository.save(hotel);
	}	
	
	/* Sample methods */
	
	@GetMapping("/nombre/{id}")
	public String getNombreById(@PathVariable Long id) {
		return hotelRepository.findNombreById(id);		
	}

	@GetMapping("/search")
	public List<Hotel> getNombreById(@RequestParam(name = "nombre") String nombre) {
		nombre = "%" + nombre + "%";
		return hotelRepository.findByNombreLike(nombre);
	}
	
}
