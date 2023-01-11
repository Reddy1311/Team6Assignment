package com.team6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import com.team6.accessingdatamysql.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	
	@PostMapping("/studentlogindetails")
	public String greeting(@RequestParam(name = "Stdid", required = true) Integer Stdid,  Model model) {


		model.addAttribute("stddetails", studentRepository.findAllByStdid(Stdid));

		return "allstddetails";
		
	
}
	
	 
}