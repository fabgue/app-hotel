package fg.app.hotel.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fg.app.hotel.core.entity.Habitacion;
import fg.app.hotel.core.entity.Hotel;
import fg.app.hotel.core.repository.HabitacionRepository;
import fg.app.hotel.core.repository.HotelRepository;

@SpringBootApplication
public class HotelCoreApplication {
	
	private static Logger logger = LoggerFactory.getLogger(HotelCoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HotelCoreApplication.class, args);
	}

	@Bean
	ApplicationRunner init(HotelRepository hotelRepo, HabitacionRepository habitacionRepo) {
		return args -> {
			logger.info("Inicio HotelCoreApplication runner");
			/*Hotel uno = hotelRepo.save(new Hotel(null, null, null , "Hotel Ritz", null, null, null));
			Hotel dos = hotelRepo.save(new Hotel(null, null, null , "Hotel Hilton", null, null, null));
			
			habitacionRepo.save(new Habitacion(null, uno.getId(), null, "101", 1, null));
			habitacionRepo.save(new Habitacion(null, uno.getId(), null, "201", 2, null));
			habitacionRepo.save(new Habitacion(null, dos.getId(), null, "1001", 1, null));
			habitacionRepo.save(new Habitacion(null, dos.getId(), null, "2001", 2, null));*/
		};
	}
}
