package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByEid(int eid);
	
	
}
