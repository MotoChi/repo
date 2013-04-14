package com.ccaper.SpringJdbcExample.dao;

import java.util.List;

import com.ccaper.SpringJdbcExample.objects.Employee;

public interface EmployeeDao {
  Employee getEmployeeById(int id);
  
  List<Employee> getEmployeesByFirstName(String firstName);
  
  List<Employee> getEmployeesByLastName(String lastName);
  
  List<Employee> getEmployeesByFullName(String firstName, String lastName);
  
  int addEmployee(Employee employee);
}
