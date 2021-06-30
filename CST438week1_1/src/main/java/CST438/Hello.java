package CST438;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello { //		localhost:8080/hello?name=arturo
	@GetMapping("/hello")
	public String hello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("time", new java.util.Date().toString());
		return "index";
	}
	
	@GetMapping("/person/new")
	public String createPerson( Model model) {
		Person person = new Person();
		model.addAttribute("person", person);
		return "person_form";
	}
	
	@PostMapping("/person")
	public String processPersonForm(@Valid Person person,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "person_form";
		}
		return "person_show";
	}
}
