package fg.app.hotel.core;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fg.app.hotel.core.entity.Hotel;
import fg.app.hotel.core.repository.HotelRepository;

@SpringBootApplication
public class HotelCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelCoreApplication.class, args);
	}

	@Bean
	ApplicationRunner init(HotelRepository repository) {
		return args -> {
			repository.save(new Hotel("Hotel1"));
			repository.save(new Hotel("Hotel2"));
			repository.save(new Hotel("Hotel3"));
		};
	}
}
