package evolution;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@RequestMapping(value = "/0", method = RequestMethod.GET)
	public void anyMethod() {
		System.out.println("Hello World");
	}
}
