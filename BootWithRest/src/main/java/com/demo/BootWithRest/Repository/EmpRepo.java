package com.demo.BootWithRest.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.BootWithRest.model.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>{

 
}
