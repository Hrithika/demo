package com.cg.sra.service;

import java.util.List;

import com.cg.sra.beans.RegistrationBean;

public interface IRegistService {

	RegistrationBean addDetails(RegistrationBean registration);

	List<RegistrationBean> getAllDonorsDetails();

}
