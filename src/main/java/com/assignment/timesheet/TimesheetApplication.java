package com.assignment.timesheet;

import com.assignment.timesheet.model.CostCenter;
import com.assignment.timesheet.model.Employee;
import com.assignment.timesheet.model.Project;
import com.assignment.timesheet.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimesheetApplication implements CommandLineRunner {

    @Autowired
    TimesheetRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(TimesheetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
