package com.cg.traineemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.traineemanagementsystem.bean.Trainee;
import com.cg.traineemanagementsystem.dao.ITraineeDao;

@Service
public class TraineeServiceImpl implements ITraineeService{
	@Autowired
	ITraineeDao traineeDao;
	
	
	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}
	
	
	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}


	@Override
	public Trainee deleteTrainee(int traineeId) {
		return traineeDao.deleteTrainee(traineeId);
	}


	@Override
	public void deleteTraineeDetails(int traineeId) {
		traineeDao.deleteTraineeDetails(traineeId);
	}


	@Override
	public Trainee modifyTraineeDetails(int traineeId, Trainee trainee) {
		return traineeDao.modifyTraineeDetails(traineeId,trainee);
	}


	@Override
	public List<Trainee> getAllTraineeDetails() {
		return traineeDao.getAllTraineeDetails();
	}

}
