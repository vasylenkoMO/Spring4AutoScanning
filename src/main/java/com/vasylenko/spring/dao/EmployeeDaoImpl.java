package com.vasylenko.spring.dao;

import com.vasylenko.spring.model.Employee;
import org.springframework.stereotype.Repository;

/**
 * Created by vastl271nko on 08.10.16.
 */
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    /*
     * Logic to save in DB goes here
     */
    @Override
    public void saveInDatabase(Employee employee) {
        System.out.println("Employee "+employee.getName()+" is registered for assessment on "+ employee.getAssessmentDate());
    }
}
