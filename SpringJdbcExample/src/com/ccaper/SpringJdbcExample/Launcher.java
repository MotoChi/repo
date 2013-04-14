package com.ccaper.SpringJdbcExample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccaper.SpringJdbcExample.dao.EmployeeDao;
import com.ccaper.SpringJdbcExample.objects.Employee;

public class Launcher {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext(
        "com/ccaper/SpringJdbcExample/spring/spring-config.xml");
    EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");
    
    int id = 2;
    Employee employee = employeeDao.getEmployeeById(id);
    System.out.println("id=" + id + ": " + employee);
    
    String firstName = "Christian";
    List<Employee> employees = employeeDao.getEmployeesByFirstName(firstName);
    System.out.println("Firstname=" + firstName + ": ");
    for (Employee e : employees) {
      System.out.println(e);
    }
    
    String lastName = "Caperton";
    employees = employeeDao.getEmployeesByLastName(lastName);
    System.out.println("Lastname=" + lastName + ": ");
    for (Employee e : employees) {
      System.out.println(e);
    }
    
    employees = employeeDao.getEmployeesByFullName(firstName, lastName);
    System.out.println("FirstName=" + firstName + " Lastname=" + lastName + ": ");
    for (Employee e : employees) {
      System.out.println(e);
    }
    
    employee = new Employee();
    employee.setFirstName("Bilbo");
    employee.setLastName("Baggins");
    employee.setId(employeeDao.addEmployee(employee));
    System.out.println(employee);
    
    ((ConfigurableApplicationContext) ctx).close();
  }
}
