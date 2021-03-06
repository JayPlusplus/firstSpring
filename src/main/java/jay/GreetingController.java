package jay;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(path="/greet")
public class GreetingController {
		
		
		
		@GetMapping("/greeting")
		public String greetingForm(Model model) {
			model.addAttribute("greeting", new Greeting());
			return "greeting";
		}
		@PostMapping ("/greeting")
		public String greetingSubmit (@Valid Greeting greeting, BindingResult bindingResult) {
			
			if (bindingResult.hasErrors()) {
				return "greeting";
			}
			return "result";
		}

}
