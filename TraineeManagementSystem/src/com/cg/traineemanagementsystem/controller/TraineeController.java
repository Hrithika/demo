package com.cg.traineemanagementsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.traineemanagementsystem.bean.Trainee;
import com.cg.traineemanagementsystem.service.ITraineeService;

@Controller
public class TraineeController {
	@Autowired
	private ITraineeService traineeService;

	public ITraineeService getTraineeService() {
		return traineeService;
	}

	public void setTraineeService(ITraineeService traineeService) {
		this.traineeService = traineeService;
	}

	@RequestMapping("/showHomePage")
	public String showHomePage() {
		return "login";
	}

	@RequestMapping("/operations")
	public ModelAndView operations(){//HttpServletRequest request,HttpServletResponse response) {
		//String userName= request.getParameter("userName");
		//String password=request.getParameter("password");
		ModelAndView view = new ModelAndView();
		//if(userName.equals("Prajwal") && password.equals("Prajwal@123"))
		//{
			view.setViewName("operation");
		//}
		//else
		//{
			//view.setViewName("login");
		//}
		return view;
		
	}

	@RequestMapping("/addTraineeForms")
	public ModelAndView showAddTrainee() {
		Trainee trainee = new Trainee();

		return new ModelAndView("addTraineeForm", "trainee", trainee);
	}

	@RequestMapping("/addTrainee")
	public ModelAndView addTrainee(
			@ModelAttribute("trainee") @Valid Trainee trainee,
			BindingResult result) {

		ModelAndView view = null;

		if (!result.hasErrors()) {
			trainee = traineeService.addTrainee(trainee);
			view = new ModelAndView("addSuccess");
			view.addObject("traineeId", trainee.getTraineeId());
			view.addObject("traineeName", trainee.getTraineeName());
			view.addObject("traineeDomain", trainee.getTraineeDomain());
			view.addObject("traineeLocation", trainee.getTraineeLocation());
		} else {
			view = new ModelAndView("addTraineeForm", "trainee", trainee);
		}
		return view;
	}

	@RequestMapping("/deleteTraineeForms")
	public ModelAndView deleteTrainee() {
		Trainee trainee = new Trainee();

		return new ModelAndView("deleteTraineeForm", "trainee", trainee);
	}

	@RequestMapping("showDeleteDetails")
	public ModelAndView showDeleteDetails() {
		Trainee trainee = new Trainee();

		return new ModelAndView("showDeleteDetails", "trainee", trainee);
	}

	@RequestMapping("/deleteTrainee")
	public ModelAndView deleteTrainee(
			@ModelAttribute("trainee") Trainee trainee) {
		ModelAndView view = new ModelAndView();
		Trainee trainee1 = new Trainee();
			trainee1 = traineeService.deleteTrainee(trainee.getTraineeId());
			if(trainee1!= null){
				view.setViewName("showDeleteDetails");
				view.addObject("trainee1", trainee1);
			}
		return view;
	}
	
	@RequestMapping("deleteTraineeDetails")
	public ModelAndView deleteTraineeDetails(
		@ModelAttribute("trainee") Trainee trainee) {
		ModelAndView view = new ModelAndView();
			traineeService.deleteTraineeDetails(trainee.getTraineeId());
			
				view.setViewName("deleteSuccess");
			
		return view;
	}
	
	@RequestMapping("/modifyTraineeForms")
	public ModelAndView modifyTraineeForms() {
		Trainee trainee = new Trainee();

		return new ModelAndView("modifyTraineeForm", "trainee", trainee);
	}


	@RequestMapping("/modifyTrainee")
	public ModelAndView modifyTrainee(
			@ModelAttribute("trainee") Trainee trainee) {
		ModelAndView view = new ModelAndView();
		Trainee trainee1 = new Trainee();
			trainee1 = traineeService.deleteTrainee(trainee.getTraineeId());
			if(trainee1!= null){
				view.setViewName("modifyTraineeDetails");
				
				view.addObject("trainee1", trainee1);
			}
		return view;
	}
	
	@RequestMapping("modifyTraineeDetails")
	public ModelAndView modifyTraineeDetails(
		@ModelAttribute("trainee") Trainee trainee) {
		ModelAndView view = new ModelAndView();
		Trainee trainee2 = traineeService.modifyTraineeDetails(trainee.getTraineeId(),trainee);
			
				view.setViewName("modifySuccess");
				view.addObject("traineeId", trainee.getTraineeId());
				view.addObject("traineeName", trainee.getTraineeName());
				view.addObject("traineeDomain", trainee.getTraineeDomain());
				view.addObject("traineeLocation", trainee.getTraineeLocation());
		
		return view;
	}
	
	@RequestMapping("/retrieveTraineeForms")
	public ModelAndView retrieveTraineeForms() {
		Trainee trainee = new Trainee();

		return new ModelAndView("showTraineeForm", "trainee", trainee);
	}

	@RequestMapping("showTrainee")
	public ModelAndView showTrainee() {
		Trainee trainee = new Trainee();

		return new ModelAndView("showDetails", "trainee", trainee);
	}

	@RequestMapping("/retrieveDetails")
	public ModelAndView retrieveDetails(
			@ModelAttribute("trainee") Trainee trainee) {
		ModelAndView view = new ModelAndView();
		Trainee trainee1 = new Trainee();
			trainee1 = traineeService.deleteTrainee(trainee.getTraineeId());
			if(trainee1!= null){
				view.setViewName("showDetails");
				view.addObject("trainee1", trainee1);
			}
		return view;
	}
	
	@RequestMapping("retrieveallTraineesForms")
	public ModelAndView getDetails() {
		ModelAndView view = new ModelAndView();

		List<Trainee> list = traineeService.getAllTraineeDetails();
		if (list.isEmpty()) {
			String Message = "There are no Trainees";
			view.setViewName("myError");
			view.addObject("msg", Message);
		} else {
			view.setViewName("viewAllTraineesList");
			view.addObject("list", list);
		}
		return view;

	}

}
