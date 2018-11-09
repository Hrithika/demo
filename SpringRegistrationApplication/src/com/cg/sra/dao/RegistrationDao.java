package com.cg.sra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.sra.beans.RegistrationBean;
@Repository
@Transactional
public class RegistrationDao implements IRegistrationDao{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public RegistrationBean addDetails(RegistrationBean registration) {
		entityManager.persist(registration);
		entityManager.flush();
		return registration;
	}
	@Override
	public List<RegistrationBean> getAllDonorsDetails() {
		TypedQuery<RegistrationBean> query = entityManager.createQuery("SELECT d FROM RegistrationBean d", RegistrationBean.class);
		System.out.println(query.getResultList());
		return query.getResultList();
		
	}

}
