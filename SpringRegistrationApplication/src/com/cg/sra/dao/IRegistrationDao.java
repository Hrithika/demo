package com.cg.sra.dao;

import java.util.List;

import com.cg.sra.beans.RegistrationBean;

public interface IRegistrationDao {

	RegistrationBean addDetails(RegistrationBean registration);

	List<RegistrationBean> getAllDonorsDetails();

}
