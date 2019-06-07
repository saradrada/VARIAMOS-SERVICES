package services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewMicro {

	@CrossOrigin
	@RequestMapping(value = "/NewMicro/test", method = RequestMethod.POST, produces = "text/plain")
	@ResponseBody
	public String executeTest(@RequestBody String data) {

		System.out.println(data);
		System.out.println("Test received");
		return "Microtest received by the server - Sara";
	}

}
