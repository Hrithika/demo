package com.cg.da.dao;

import com.cg.da.beans.Employee;

public interface IDao {

	void addEmployee(Employee employee);

	Employee getDetails(int employee);

	void deleteDetails(Integer employeeId);

	Employee modifyDetails(Integer employeeId, Employee employee);

}
