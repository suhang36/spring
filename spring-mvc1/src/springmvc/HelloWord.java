package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWord {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
}
