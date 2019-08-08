package fg.app.hotel.core.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public Hotel get(@PathVariable Long id) {
		return hotelRepository.findById(id).orElse(null);
	}
	
	@PostMapping
	public Hotel post(@RequestBody Hotel hotel) {
		return hotelRepository.save(hotel);
	}

}
