package com.cg.tes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tes.beans.EmployeeBean;
import com.cg.tes.beans.User;
import com.cg.tes.dao.IEmployeeDao;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	IEmployeeDao traineeDao;
	
	public IEmployeeDao getTraineeDao() {
		return traineeDao;
	}

	public void setTraineeDao(IEmployeeDao traineeDao) {
		this.traineeDao = traineeDao;
	}

	@Override
	public EmployeeBean addTrainee(EmployeeBean trainee) {
		// TODO Auto-generated method stub
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public List<EmployeeBean> getAllTraineeDetails() {
		// TODO Auto-generated method stub
		return traineeDao.getAllTraineeDetails();
	}

	@Override
	public EmployeeBean deleteTrainee(int traineeId) {
		return traineeDao.deleteTrainee(traineeId);
	}


	@Override
	public void deleteTraineeDetails(int traineeId) {
		traineeDao.deleteTraineeDetails(traineeId);
	}


	@Override
	public EmployeeBean modifyTraineeDetails(int traineeId, EmployeeBean trainee) {
		
		return traineeDao.modifyTraineeDetails(traineeId, trainee);
	}


	/*@Override
	public User addTrainee(User user) {
		// TODO Auto-generated method stub
		return traineeDao.addTrainee(user);
	}
*/
}
