package com.assignment.timesheet.model;

import javax.persistence.*;

@Entity
@Table(name="cost_center")
public class CostCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Double totalCost;
    private Double Budget;

    public CostCenter() {
    }

    public int getId() {
        return id;
    }

    public CostCenter(int id, Double totalCost, Double budget) {
        this.id = id;
        this.totalCost = totalCost;
        Budget = budget;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getBudget() {
        return Budget;
    }

    public void setBudget(Double budget) {
        Budget = budget;
    }

//    public Project getProject() {
//        return project;
//    }

    public void setProject(Project project) {
        this.project = project;
    }

    public CostCenter(Double totalCost, Double budget) {
        this.totalCost = totalCost;
        Budget = budget;
    }

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Override
    public String toString() {
        return "CostCenter{" +
                "id=" + id +
                ", totalCost=" + totalCost +
                ", Budget=" + Budget +
                ", project=" + project +
                '}';
    }
}
