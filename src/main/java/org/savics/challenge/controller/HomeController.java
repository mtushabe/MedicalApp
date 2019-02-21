package org.savics.challenge.controller;

import org.savics.challenge.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private PatientService patientService;

	@RequestMapping("/")
	public String home() {
		return "redirect:/index";

	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

}
