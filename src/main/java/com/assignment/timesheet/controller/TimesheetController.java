package com.assignment.timesheet.controller;

import com.assignment.timesheet.model.CostCenter;
import com.assignment.timesheet.model.Employee;
import com.assignment.timesheet.model.Project;
import com.assignment.timesheet.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/timesheet")
public class TimesheetController {
    @Autowired
    TimesheetRepository repository;

    @GetMapping(value = "/get")
    public Employee getEmployees() {

        CostCenter costCenter1 = new CostCenter(123.676, 12123.7);
        CostCenter costCenter2 = new CostCenter(123.676, 12.7);

        Project p1 = new Project("simpayx");
        Project p2 = new Project("R2D2");

        costCenter1.setProject(p1);
        p1.setCostCenter(costCenter1);
        costCenter2.setProject(p2);
        p2.setCostCenter(costCenter2);


        Employee e = new Employee("amol", "Dhope");
        e.setId(1000L);
        e.getProjects().add(p1);
        e.getProjects().add(p2);

        repository.save(e);
        Employee sss = repository.findById(1l).get();
        return sss;
    }

}
