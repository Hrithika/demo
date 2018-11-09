package com.cg.traineemanagementsystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Trainee_Table")
public class Trainee {
	
	@Id
	private int traineeId;
	
	@NotEmpty(message="Please Enter Trainee Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
	private String traineeName;
	
	@NotEmpty(message="Please Enter Valid Domain Name")
	private String traineeDomain;
	
	@NotEmpty(message="Please Enter Valid Location Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Location must contain only alphabets")
	private String traineeLocation;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	public Trainee(int traineeId, String traineeName, String traineeDomain,
			String traineeLocation) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	public Trainee() {
	}
}
