package com.cg.tes.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "employeeRegister1")
public class EmployeeBean {
	
	
/*	@NotNull(message = "Please Enter id")
	@Pattern(regexp = "^[0-9]{6}", message = "id  must be 6 digits")
	
*/	/*@Digits(integer=6,fraction=0)*/

	@Id
	 @NotNull
	 @Range(min=100000, max=999999)
	 private Integer employeeId;

	@NotEmpty(message = "Please Enter employee Name")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{3,}", message = "employeename must contain only alphabets")
	private String employeeName;
	
/*	@NotNull(message = "Please Enter salary")
	@Pattern(regexp = "^[1-9]+$", message = "salary must be greater than 0")
*/	
	
	@NotNull
	@Range(min=1, max=10000000)
	private Long salary;
	
	@NotEmpty(message = "Please Enter project name")
	@Pattern(regexp = "^[A-Z]+$", message = "project name must contain only capitals")
	private String projectName;



	

	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	

	

	public EmployeeBean(Integer employeeId, String employeeName, Long salary,
			String projectName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.projectName = projectName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	}

	
	


