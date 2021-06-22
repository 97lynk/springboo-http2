package io.a97lynk.sbh2c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.PushBuilder;

@Controller
public class H2cController {

	@RequestMapping("/withPush")
	public String demoH2c(PushBuilder pushBuilder) {
		if (pushBuilder != null)
			pushBuilder.path("/images/night-scene.jpg").push();
		return "index";
	}

	@RequestMapping("/withoutPush")
	public String demoH2cWithoutPush() {
		return "index";
	}
}
