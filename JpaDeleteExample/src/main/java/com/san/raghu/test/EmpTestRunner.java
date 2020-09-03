package com.san.raghu.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.san.raghu.model.Employee;
import com.san.raghu.repo.Employeerepo;


@Component
public class EmpTestRunner implements CommandLineRunner {
	@Autowired
	private Employeerepo repo;
public void run(String... args) throws Exception {
repo.saveAll(
				Arrays.asList(
						new Employee(101, "AJAY", 250.0, "DEV"),
						new Employee(102, "SAM", 350.0, "DEV"),
						new Employee(103, "SYED", 280.0, "BA"),
						new Employee(104, "VIJAY", 390.0, "QA"),
						new Employee(105, "AHMED", 890.0, "BA"),
						new Employee(106, "JAI", 360.0, "QA")
						)
				);
		System.out.println("------COUNT--------");
System.out.println(repo.count());
		
		System.out.println("------DELETE--------");
		//Data JPA
		repo.deleteById(103);
		
		//Sun-JPA-Spec
		Employee emp = new Employee();
		emp.setEmpId(104); 
		repo.delete(emp); //object having PK
		
		//Sun-JPA-Spec - multiple delete
		repo.deleteAll(
				List.of(  //object having PK
						new Employee(101),
						new Employee(105)
				)
				);
		
		
//		repo.deleteAll();
		
		repo.findAll().forEach(System.out::println);
		
	}
}
