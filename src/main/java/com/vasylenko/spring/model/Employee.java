package com.vasylenko.spring.model;

import org.joda.time.LocalDate;

/**
 * Created by vastl271nko on 08.10.16.
 */
public class Employee {
    private int id;

    private String name;

    private LocalDate assessmentDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", assessmentDate="
                + assessmentDate + "]";
    }

}
