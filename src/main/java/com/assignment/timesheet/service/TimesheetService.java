package com.assignment.timesheet.service;

import com.assignment.timesheet.model.CostCenter;
import com.assignment.timesheet.model.Project;
import com.assignment.timesheet.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimesheetService {

    @Autowired
    TimesheetRepository repository;
    public void addProject(Project newProject){

//        repository.save(newProject);

    }
}
