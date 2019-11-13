package com.assignment.timesheet.repository;

import com.assignment.timesheet.model.Employee;
import com.assignment.timesheet.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesheetRepository extends JpaRepository<Employee,Long> {

}
