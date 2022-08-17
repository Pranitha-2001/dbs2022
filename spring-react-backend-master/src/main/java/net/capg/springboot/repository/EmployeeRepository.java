package net.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.capg.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
