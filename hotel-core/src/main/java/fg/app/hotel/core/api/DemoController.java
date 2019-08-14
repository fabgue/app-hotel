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

import fg.app.hotel.core.entity.Demo;
import fg.app.hotel.core.repository.DemoRepository;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoRepository demoRepository;
	
	@GetMapping
	public List<Demo> getAll() {
		return demoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Demo getDemoById(@PathVariable Long id) {
		return demoRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro no encontrado"));
	}
	
	@PostMapping
	public Demo createDemo(@RequestBody Demo hotel) {
		return demoRepository.save(hotel);
	}

	@PutMapping("/{id}")
	public Demo updateHotel(@PathVariable(value = "id") Long id, @RequestBody Demo hotel) {
		return demoRepository.save(hotel);
	}	
	
	/* Sample methods */
	
	@GetMapping("/nombre/{id}")
	public String getNombreById(@PathVariable Long id) {
		return demoRepository.findNombreById(id);		
	}

	@GetMapping("/search")
	public List<Demo> getByNombreLike(@RequestParam(name = "nombre") String nombre) {
		nombre = "%" + nombre + "%";
		return demoRepository.findByNombreLike(nombre);
	}
	
	@GetMapping("/count")
	public long getCountByIdCiudad(@RequestParam(name = "idCiudad") Long idCiudad) {
		return demoRepository.countByIdCiudad(idCiudad);
	}
	
	@GetMapping("/searchByCiudad")
	public List<Demo> getByIdCiudad(@RequestParam(name = "idCiudad") Long idCiudad) {
		return demoRepository.findByIdCiudad(idCiudad);
	}

	@GetMapping("/searchByPais")
	public List<Demo> getByIdPais(@RequestParam(name = "idPais") Long idPais) {
		return demoRepository.findByIdPais(idPais);
	}
	
}
