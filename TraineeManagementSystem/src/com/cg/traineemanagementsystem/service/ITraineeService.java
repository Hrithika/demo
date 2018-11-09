package com.cg.traineemanagementsystem.service;

import java.util.List;

import com.cg.traineemanagementsystem.bean.Trainee;

public interface ITraineeService {

	Trainee addTrainee(Trainee trainee);

	Trainee deleteTrainee(int traineeId);

	void deleteTraineeDetails(int traineeId);

	Trainee modifyTraineeDetails(int traineeId, Trainee trainee);

	List<Trainee> getAllTraineeDetails();

	

}
