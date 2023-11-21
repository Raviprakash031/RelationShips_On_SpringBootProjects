package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class JobSeekerModel {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int jobSeekerId;
	private String joSeekerName;
	private String jobSeekerMobileNumber;
	private String jobSeekerEmail;
	private String jobSeekerPassword;
	
	@OneToOne(mappedBy="jobSeeker")
	
	private JobSeekerProfile jobSeekerProfile;
	
	public JobSeekerModel(int jobSeekerId, String joSeekerName, String jobSeekerMobileNumber, String jobSeekerEmail,
			String jobSeekerPassword, JobSeekerProfile jobSeekerProfile) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.joSeekerName = joSeekerName;
		this.jobSeekerMobileNumber = jobSeekerMobileNumber;
		this.jobSeekerEmail = jobSeekerEmail;
		this.jobSeekerPassword = jobSeekerPassword;
		this.jobSeekerProfile = jobSeekerProfile;
	}
	
	public JobSeekerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}
	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	public String getJoSeekerName() {
		return joSeekerName;
	}
	public void setJoSeekerName(String joSeekerName) {
		this.joSeekerName = joSeekerName;
	}
	public String getJobSeekerMobileNumber() {
		return jobSeekerMobileNumber;
	}
	public void setJobSeekerMobileNumber(String jobSeekerMobileNumber) {
		this.jobSeekerMobileNumber = jobSeekerMobileNumber;
	}
	public String getJobSeekerEmail() {
		return jobSeekerEmail;
	}
	public void setJobSeekerEmail(String jobSeekerEmail) {
		this.jobSeekerEmail = jobSeekerEmail;
	}
	public String getJobSeekerPassword() {
		return jobSeekerPassword;
	}
	public void setJobSeekerPassword(String jobSeekerPassword) {
		this.jobSeekerPassword = jobSeekerPassword;
	}

	public JobSeekerProfile getJobSeekerProfile() {
		return jobSeekerProfile;
	}

	public void setJobSeekerProfile(JobSeekerProfile jobSeekerProfile) {
		this.jobSeekerProfile = jobSeekerProfile;
	}
	
	

}
