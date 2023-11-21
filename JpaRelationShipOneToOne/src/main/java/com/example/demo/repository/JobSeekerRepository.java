package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.JobSeekerModel;
@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeekerModel,Integer> {
	

}
