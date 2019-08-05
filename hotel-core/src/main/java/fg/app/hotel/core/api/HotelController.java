package fg.app.hotel.core.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fg.app.hotel.core.entity.Hotel;
import fg.app.hotel.core.repository.HotelRepository;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@GetMapping("")
	public List<Hotel> getHotelAll() {
		return hotelRepository.findAll();
	}

}
