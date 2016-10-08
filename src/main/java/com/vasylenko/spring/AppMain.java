package com.vasylenko.spring;

import com.vasylenko.spring.configuration.AppConfig;
import com.vasylenko.spring.model.Employee;
import com.vasylenko.spring.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by vastl271nko on 08.10.16.
 */
public class AppMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        EmployeeService service = (EmployeeService) context.getBean("employeeService");

        /*
         * Register employee using service
         */
        Employee employee = new Employee();
        employee.setName("Maksym Vasylenko");
        service.registerEmployee(employee);

        context.close();
    }
}
