package com.cg.sra.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
@Entity
@Table(name="Registration")
public class RegistrationBean {

	@Id
	@Range(min=100000,max=999999,message="ID should be equal to 6 digits")
	private Integer empId;
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Employeename must contain only alphabets")
	private String empName;
	@Range(min=1,message="ID should be equal to 6 digits")
	private Double salary;
	@NotEmpty(message="Please Enter Project Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Projectname must contain only alphabets")
	private String projName;
	public RegistrationBean(Integer empId, String empName, Double salary,
			String projName) {
		super();
		
		this.empId = empId;
		
		this.empName = empName;
		this.salary = salary;
		this.projName = projName;
	}
	public RegistrationBean() {
		super();
		
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	
	
}
