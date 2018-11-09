package com.cg.traineemanagementsystem.dao;

import java.util.List;

import com.cg.traineemanagementsystem.bean.Trainee;

public interface ITraineeDao {

	Trainee addTrainee(Trainee trainee);

	Trainee deleteTrainee(int traineeId);

	void deleteTraineeDetails(int traineeId);

	Trainee modifyTraineeDetails(int traineeId, Trainee trainee);

	List<Trainee> getAllTraineeDetails();

}
