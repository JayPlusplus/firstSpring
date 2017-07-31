package jay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeCotroller {

		@RequestMapping("/")
		public String index(Model model) {
			model.addAttribute("message", "my hair is gray");
			return "hello";
		}
}
