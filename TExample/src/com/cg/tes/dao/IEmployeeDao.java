package com.cg.tes.dao;

import java.util.List;

import com.cg.tes.beans.EmployeeBean;
import com.cg.tes.beans.User;

public interface IEmployeeDao {

	EmployeeBean addTrainee(EmployeeBean trainee);

	List<EmployeeBean> getAllTraineeDetails();

	EmployeeBean deleteTrainee(int traineeId);

	void deleteTraineeDetails(int traineeId);

	EmployeeBean modifyTraineeDetails(int traineeId, EmployeeBean trainee);

/*	User addTrainee(User user);
*/
}
