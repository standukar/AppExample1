package app.example.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppEgController {
	@RequestMapping(value = "/GM", method = RequestMethod.GET)
	public String showGMPage() {
		System.out.println("Good Morning!! Have a great Day!!!");
		return "GM-Page";
	}

}
