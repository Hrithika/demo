package com.cg.sra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sra.beans.RegistrationBean;
import com.cg.sra.dao.IRegistrationDao;
@Service
public class RegistrationService implements IRegistService {
	@Autowired
	IRegistrationDao dao;
	
	
	@Override
	public RegistrationBean addDetails(RegistrationBean registration) {
		
		return dao.addDetails(registration);
	}


	@Override
	public List<RegistrationBean> getAllDonorsDetails() {
		
		return dao. getAllDonorsDetails();
	}

}
