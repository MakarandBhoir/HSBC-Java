package hsbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="welcome")
public class WelcomeController {
	//http://localhost:9090/welcome/home
	@GetMapping(path="home")
	public String home() {
		System.out.println("---- home ----");
		return "index";
	}
}
