package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class IndexController {
	@GetMapping("/index")
	public String index() {
		return "views/index";
	}
}