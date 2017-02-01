package com.ondoymatics.hms.app.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ondoymatics.hms.app.models.Patient;
import com.ondoymatics.hms.app.service.PatientService;
import com.ondoymatics.hms.app.utils.JSONResponse;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getAllPatient(Model model) {
		model.addAttribute("patients", patientService.getAllPatient());
		return "patient_all";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JSONResponse addPatient(@ModelAttribute("patient") Patient patient, Errors errors) {

		if (errors.hasErrors()) {
			return new JSONResponse(400, errors.getFieldError().getDefaultMessage(), null);
		} else {
			Date now = new Date();
			patient.setAdded(now);
			patientService.registerPatient(patient);
			return new JSONResponse(200, "success", null);
		}
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Patient getPatientById(@PathVariable("id") final Long id) {
		Patient patient = patientService.getPatientById(id);
		return patient;
	}

	@RequestMapping(value = "/addPatientForm", method = RequestMethod.GET)
	public String addPatientForm() {
		return "patient_add_form";
	}
}
