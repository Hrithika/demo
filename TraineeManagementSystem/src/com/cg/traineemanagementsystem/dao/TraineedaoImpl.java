package com.cg.traineemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.traineemanagementsystem.bean.Trainee;

@Repository
@Transactional
public class TraineedaoImpl implements ITraineeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		entityManager.flush();
		return trainee;
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {
		return entityManager.find(Trainee.class, traineeId);
	}

	@Override
	public void deleteTraineeDetails(int traineeId) {
		Trainee trainee1=entityManager.find(Trainee.class, traineeId);
		entityManager.remove(trainee1);
	}

	@Override
	public Trainee modifyTraineeDetails(int traineeId, Trainee trainee) {
		entityManager.find(Trainee.class, traineeId);
		return entityManager.merge(trainee);	
	}

	@Override
	public List<Trainee> getAllTraineeDetails() {
		TypedQuery<Trainee> query = entityManager.createQuery(
				"SELECT t FROM Trainee t", Trainee.class);
		return query.getResultList();
	}

}
