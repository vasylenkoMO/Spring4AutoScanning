package com.vasylenko.spring.service;

import com.vasylenko.spring.dao.EmployeeDao;
import com.vasylenko.spring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vastl271nko on 08.10.16.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private DateService dateService;

    @Autowired
    EmployeeDao employeeDao;
    @Override
    public void registerEmployee(Employee employee) {
        employee.setAssessmentDate(dateService.getNextAssessmentDate());
        employeeDao.saveInDatabase(employee);
    }
}
