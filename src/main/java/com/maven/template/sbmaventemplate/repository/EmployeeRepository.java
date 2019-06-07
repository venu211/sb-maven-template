package com.maven.template.sbmaventemplate.repository;

import com.maven.template.sbmaventemplate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
