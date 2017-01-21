package com.ondoymatics.hms.app.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ondoymatics.hms.app.models.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPatient(@ModelAttribute("patient") Patient patient) {

		return "";
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Patient getPatientById(@PathVariable("id") final Long id) {

		return null;
	}
}
