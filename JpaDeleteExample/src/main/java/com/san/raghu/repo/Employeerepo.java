package com.san.raghu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.san.raghu.model.Employee;

@Repository
public interface Employeerepo extends CrudRepository<Employee, Integer> {
	

}
