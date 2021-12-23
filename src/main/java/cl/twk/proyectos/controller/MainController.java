package cl.twk.proyectos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(value = "manga")
	public String estiloManga() {
		return "estiloManga";
	}

	@GetMapping(value = "libre")
	public String estiloLibre() {
		return "estiloLibre";
	}

	@GetMapping(value = "mangas")
	public String mangas() {
		return "mangas";
	}

	@GetMapping(value = "destino")
	public String destino() {
		return "destino";
	}
	
	@GetMapping(value = "wanted")
	public String wanted() {
		return "wanted";
	}
}