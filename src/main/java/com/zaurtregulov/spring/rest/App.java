package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configurator.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List <Employee> allEmployee = communication.getAllEmployees();
//        System.out.println(allEmployee);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);


//        Employee employee = new Employee("Aliy", "Levanova", "HR", 850);
//        employee.setId(16);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(16);

    }
}
