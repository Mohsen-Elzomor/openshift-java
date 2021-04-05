package net.tedata.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class OpenShiftController {

	@GetMapping("/GetMessages")
	public String getMessage() {
		return "Inner Message From Open Shift  -_-";
	}
	
	@GetMapping("/")
	public String getMessage2() {
		return "Root Message From Open Shift  -_-";
	}
}
