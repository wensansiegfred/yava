package com.ondoymatics.hms.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String getDashboardPage(Model model) {
		return "dashboard";
	}
}
