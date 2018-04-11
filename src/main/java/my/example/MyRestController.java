package my.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping("/app")
	public String app() {
		return "REST endpoint";
	}
	
}
