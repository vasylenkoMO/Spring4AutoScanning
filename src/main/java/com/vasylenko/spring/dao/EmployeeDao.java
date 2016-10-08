package com.vasylenko.spring.dao;

import com.vasylenko.spring.model.Employee;

/**
 * Created by vastl271nko on 08.10.16.
 */
public interface EmployeeDao {

    void  saveInDatabase(Employee employee);
}
