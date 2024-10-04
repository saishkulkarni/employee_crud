package org.jsp.employee_crud.repository;

import org.jsp.employee_crud.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
