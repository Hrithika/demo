package com.cg.tes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.tes.beans.EmployeeBean;
import com.cg.tes.beans.User;

@Repository
@Transactional
public class EmployeeDao implements IEmployeeDao{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public EmployeeBean addTrainee(EmployeeBean trainee) {
		entityManager.persist(trainee);
		entityManager.flush();
		return trainee;
	}

	@Override
	public List<EmployeeBean> getAllTraineeDetails() {
		TypedQuery<EmployeeBean> query = entityManager.createQuery(
				"SELECT t FROM EmployeeBean t", EmployeeBean.class);
		return query.getResultList();
	}
	
	@Override
	public EmployeeBean deleteTrainee(int traineeId) {
		return entityManager.find(EmployeeBean.class, traineeId);
	}

	@Override
	public void deleteTraineeDetails(int traineeId) {
		EmployeeBean trainee1=entityManager.find(EmployeeBean.class, traineeId);
		entityManager.remove(trainee1);
	}

	@Override
	public EmployeeBean modifyTraineeDetails(int traineeId, EmployeeBean trainee) {
		entityManager.find(EmployeeBean.class, traineeId);
		return entityManager.merge(trainee);		
	}


	/*@Override
	public User addTrainee(User user) {
		entityManager.persist(user);
		entityManager.flush();
		return user;
	}*/

}
