package net.tedata.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("OpenShift")
public class JavaController {

	@GetMapping("/Print")
	public String getMessage() {
		return "Inner Message From Other Controller  -_-";
	}
	
}
