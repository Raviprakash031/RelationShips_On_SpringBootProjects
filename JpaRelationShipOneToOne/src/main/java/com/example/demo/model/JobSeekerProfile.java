package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class JobSeekerProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	private int profileId;
	private String xthSchoolName;
	private String intermediateCollegeName;
	private String engineeringCollegeName;
	private String skill;
	
	@OneToOne
	private JobSeekerModel jobSeeker;

	public JobSeekerProfile(int profileId, String xthSchoolName, String intermediateCollegeName,
			String engineeringCollegeName, String skill, JobSeekerModel jobSeeker) {
		super();
		this.profileId = profileId;
		this.xthSchoolName = xthSchoolName;
		this.intermediateCollegeName = intermediateCollegeName;
		this.engineeringCollegeName = engineeringCollegeName;
		this.skill = skill;
		this.jobSeeker = jobSeeker;
	}

	public JobSeekerProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getXthSchoolName() {
		return xthSchoolName;
	}

	public void setXthSchoolName(String xthSchoolName) {
		this.xthSchoolName = xthSchoolName;
	}

	public String getIntermediateCollegeName() {
		return intermediateCollegeName;
	}

	public void setIntermediateCollegeName(String intermediateCollegeName) {
		this.intermediateCollegeName = intermediateCollegeName;
	}

	public String getEngineeringCollegeName() {
		return engineeringCollegeName;
	}

	public void setEngineeringCollegeName(String engineeringCollegeName) {
		this.engineeringCollegeName = engineeringCollegeName;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public JobSeekerModel getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeekerModel jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	
	
	

}
