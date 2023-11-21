package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee1;

@Repository
public interface Employee1Repository extends JpaRepository<Employee1,Integer>{

}
