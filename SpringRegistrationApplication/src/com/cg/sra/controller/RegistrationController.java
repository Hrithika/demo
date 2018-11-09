package com.cg.sra.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sra.beans.RegistrationBean;
import com.cg.sra.service.IRegistService;



@Controller
public class RegistrationController {
	@Autowired

	private IRegistService service;

	public IRegistService getService() {
		return service;
	}

	public void setService(IRegistService service) {
		this.service = service;
	}
	
	@RequestMapping("/showHomePage")
	public String showHomePage() {
		return "index";
	}
	@RequestMapping("/showRegistration")
public ModelAndView addTrainee() {
		
RegistrationBean registration=new RegistrationBean();
		
		return new ModelAndView("addRegistrationForm", "registration",registration );
	}
	
	@RequestMapping("/addRegistration")
	public ModelAndView addRegistration(
			@ModelAttribute("registration") @Valid RegistrationBean registration,
			BindingResult result) {
		
		ModelAndView mv = null;

		if (!result.hasErrors()) {
			
			registration = service.addDetails(registration);
			mv = new ModelAndView("addSuccess");
			mv.addObject("empId", registration.getEmpId());
	
			mv.addObject("empName", registration.getEmpName());
			mv.addObject("salary", registration.getSalary());
			mv.addObject("projName", registration.getProjName());
		} else {
			mv = new ModelAndView("addRegistrationForm", "registration", registration);
		}

		return mv;
	}
	
	@RequestMapping("/showViewAllRegistrations")
	public ModelAndView showViewAllRegistrations() {

		ModelAndView mv = new ModelAndView();

		List<RegistrationBean> list = service.getAllDonorsDetails();
		if (list.isEmpty()) {
			String msg = "There are no Registrations";
			mv.setViewName("myError");
			mv.addObject("msg", msg);
		} else {
			mv.setViewName("viewDetails");
			// Add the attribute to the model
			mv.addObject("list", list);
		}
		return mv;
	}
}
