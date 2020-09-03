package com.san.raghu.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
  @Id
  private Integer empId;
  private String empName;
  private Double empSal;
  private String empDept;
public Employee(Integer empId) {
	
	this.empId = empId;
}
  
}
