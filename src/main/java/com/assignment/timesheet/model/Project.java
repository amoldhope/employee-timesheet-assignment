package com.assignment.timesheet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;

    String projectName;

    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "project")
    CostCenter costCenter;

//    public List<Employee> getEmployees() {
//        return employees;
//    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Project() {
    }

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "projects")
    private List<Employee> employees = new ArrayList<>();

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public CostCenter getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(CostCenter costCenter) {
        this.costCenter = costCenter;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", costCenter=" + costCenter +
                ", employees=" + employees +
                '}';
    }
}
