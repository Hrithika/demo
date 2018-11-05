package com.cg.tes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.tes.beans.EmployeeBean;
import com.cg.tes.service.IEmployeeService;

@Controller
public class TController {
	@Autowired
	private IEmployeeService traineeservice;

	public IEmployeeService getTraineeservice() {
		return traineeservice;
	}
	//getter and setter for service

	public void setTraineeservice(IEmployeeService traineeservice) {
		this.traineeservice = traineeservice;
	}

	
	@RequestMapping("/selectOption")
	public String selectOption() {
		return "index";
	}

	@RequestMapping("/showHomePage")
	public String showHomePage() {
		return "login";

	}

	@RequestMapping("/showAddTraineeForm")
	public ModelAndView showAddTrainee() {
		// Create an attribute of type Question
		EmployeeBean trainee = new EmployeeBean();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("addTraineeForm", "trainee", trainee);
	}

	@RequestMapping("/operations")
	public String operations() {
		return "index";
	}

	@RequestMapping("/addTrainee")
	public ModelAndView addDonation(
			@ModelAttribute("trainee") @Valid EmployeeBean trainee,
			BindingResult result) {

		ModelAndView mv = null;

		if (!result.hasErrors()) {
			trainee = traineeservice.addTrainee(trainee);
			mv = new ModelAndView("addSuccess");
			mv.addObject("traineeId", trainee.getEmployeeId());
			mv.addObject("traineeName", trainee.getEmployeeName());
		} else {
			mv = new ModelAndView("addTraineeForm", "trainee", trainee);
		}

		return mv;
	}

	/*@RequestMapping("/retrieveTraineeForms")
	public ModelAndView retrieveTraineeForms() {
		EmployeeBean trainee = new EmployeeBean();

		return new ModelAndView("showTraineeForm", "trainee", trainee);
	}

	@RequestMapping("showTrainee")
	public ModelAndView showTrainee() {
		EmployeeBean trainee = new EmployeeBean();

		return new ModelAndView("showDetails", "trainee", trainee);
	}

	@RequestMapping("/retrieveDetails")
	public ModelAndView retrieveDetails(
			@ModelAttribute("trainee") EmployeeBean trainee) {
		ModelAndView view = new ModelAndView();
		EmployeeBean trainee1 = new EmployeeBean();
		trainee1 = traineeservice.deleteTrainee(trainee.getEmpId());
		if (trainee1 != null) {
			view.setViewName("showDetails");
			view.addObject("trainee1", trainee1);
		} else {
			view.setViewName("myError");
		}

		return view;
	}*/

	@RequestMapping("retrieveallTraineesForms")
	public ModelAndView getDetails() {
		ModelAndView view = new ModelAndView();

		List<EmployeeBean> list = traineeservice.getAllTraineeDetails();
		if (list.isEmpty()) {
			String Message = "There are no employees";
			view.setViewName("myError");
			view.addObject("msg", Message);
		} else {
			view.setViewName("viewAllTraineesList");
			view.addObject("list", list);
		}
		return view;

	}

}
