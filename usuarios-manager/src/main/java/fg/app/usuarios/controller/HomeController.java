package fg.app.usuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHome(@RequestParam(name="texto", required=false, defaultValue="Home") String texto, Model model) {
        model.addAttribute("texto", texto);
        return "home";
    }
	
}
