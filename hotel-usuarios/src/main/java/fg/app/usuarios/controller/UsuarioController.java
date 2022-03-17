package fg.app.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fg.app.usuarios.dto.UsuarioDto;
import fg.app.usuarios.dto.UsuarioValidator;
import fg.app.usuarios.service.SecurityServiceImpl;
import fg.app.usuarios.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private SecurityServiceImpl securityService;
	
	@Autowired
	private UsuarioValidator usuarioValidator;

	@GetMapping("/registro")
	public String registration(Model model) {
		model.addAttribute("usuarioForm", new UsuarioDto());
		return "registro";
	}

	
	@PostMapping("/registro")
	public String registration(@ModelAttribute("usuarioForm") UsuarioDto usuarioForm, BindingResult bindingResult) {
		usuarioValidator.validate(usuarioForm, bindingResult);
		if (bindingResult.hasErrors()) {
			return "registro";
		}
		usuarioService.createUsuario(usuarioForm);
		securityService.autoLogin(usuarioForm.getLogin(), usuarioForm.getClave());
		return "redirect:/inicio";
	}

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");
		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");
		return "login";
	}

	@GetMapping({ "/", "/inicio" })
	public String inicio(Model model) {
		return "inicio";
	}
	

}
