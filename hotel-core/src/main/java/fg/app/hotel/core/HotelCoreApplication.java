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
			logger.info("Inicio HotelCoreApplication");
			hotelRepo.save(
				new Hotel(null, "Hotel Ritz","direccion1", "telefono1", "Hotel1", "localidad1", "5 estrellas"));
			hotelRepo.save(
				new Hotel(null, "Hotel Hilton","direccion2", "telefono2", "Hotel2", "localidad2", "5 estrellas"));
			hotelRepo.save(
				new Hotel(null, "Hotel Watford","direccion3", "telefono3", "Hotel3", "localidad3", "5 estrellas"));	
			
			habitacionRepo.save(new Habitacion(null, 1L, "101", 1, "Doble", 2));
			habitacionRepo.save(new Habitacion(null, 1L, "201", 2, "Doble", 2));
		};
	}
}
