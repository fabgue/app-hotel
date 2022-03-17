package fg.app.hotel.core.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fg.app.hotel.core.dto.DemoResult;
import fg.app.hotel.core.entity.Demo;
import fg.app.hotel.core.repository.DemoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value="Demo Management System", description="Operations pertaining to Demo entity")
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoRepository demoRepository;
	
	@ApiOperation(value = "View a list of available Demos", response = List.class)
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Successfully retrieved list"),
	    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})	
	@GetMapping
	public List<Demo> getAll() {
		return demoRepository.findAll();
	}

	@ApiOperation(value = "Get a Demo by Id")
	@GetMapping("/{id}")
	public Demo getDemoById(
		@ApiParam(value = "Demo id from object will retrieve", required = true)
		@PathVariable Long id) throws Exception {
		return demoRepository.findById(id).orElseThrow(() -> new Exception("Registro no encontrado"));
	}
	
	@PostMapping
	public Demo createDemo(@RequestBody Demo demo) {
		return demoRepository.save(demo);
	}

	@PutMapping("/{id}")
	public Demo updateDemo(@PathVariable(value = "id") Long id, @RequestBody Demo demo) {
		Demo demoEdit = demoRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro no encontrado"));
		demoEdit.setNombre(demo.getNombre());
		demoEdit.setCiudad(demo.getCiudad());
		// Alternative verify Id and copyAllProperties
		return demoRepository.save(demoEdit);
	}
	
	@DeleteMapping("/{id}")
	public Map<String,Object> deleteDemo(@PathVariable(value = "id") Long id) {
		Demo demo = demoRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro no encontrado"));
		demoRepository.delete(demo);
        Map<String, Object> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;	
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
		return demoRepository.findByIdCiudadOrderByNombre(idCiudad);
	}

	@GetMapping("/searchByPais")
	public List<Demo> getByIdPais(@RequestParam(name = "idPais") Long idPais) {
		return demoRepository.findByIdPais(idPais);
	}
	
	@GetMapping("/all")
	public Page<DemoResult> getAllDemoPage(Pageable pageRequest) {
		return demoRepository.findAllDemoPage(pageRequest);
	}
}
