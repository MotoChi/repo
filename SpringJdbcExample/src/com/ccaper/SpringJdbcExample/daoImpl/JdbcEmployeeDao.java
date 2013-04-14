package com.ccaper.SpringJdbcExample.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.ccaper.SpringJdbcExample.dao.EmployeeDao;
import com.ccaper.SpringJdbcExample.objects.Employee;

public class JdbcEmployeeDao extends NamedParameterJdbcDaoSupport implements
    EmployeeDao {
  private static final String TABLE = "employees";
  private static final String ID_COL = "id";
  private static final String FIRSTNAME_COL = "firstName";
  private static final String LASTNAME_COL = "lastName";
  private static final String SQL_SELECT_EMPLOYEE_BY_ID = String.format(
      "select %s, %s, %s from %s where %s = :id", ID_COL, FIRSTNAME_COL,
      LASTNAME_COL, TABLE, ID_COL);
  private static final String SQL_SELECT_EMPLOYEE_BY_FIRSTNAME = String.format(
      "select %s, %s, %s from %s where %s = :firstName", ID_COL, FIRSTNAME_COL,
      LASTNAME_COL, TABLE, FIRSTNAME_COL);
  private static final String SQL_SELECT_EMPLOYEE_BY_LASTNAME = String.format(
      "select %s, %s, %s from %s where %s = :lastName", ID_COL, FIRSTNAME_COL,
      LASTNAME_COL, TABLE, LASTNAME_COL);
  private static final String SQL_SELECT_EMPLOYEE_BY_FULLNAME = String.format(
      "select %s, %s, %s from %s where %s = :firstName and %s = :lastName",
      ID_COL, FIRSTNAME_COL, LASTNAME_COL, TABLE, FIRSTNAME_COL, LASTNAME_COL);
  private static final String SQL_INSERT_EMPLOYEE = String.format(
      "insert into %s (%s, %s) values (:firstName, :lastName)",
      TABLE, FIRSTNAME_COL, LASTNAME_COL);

  RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
      Employee employee = new Employee();
      employee.setId(rs.getInt(ID_COL));
      employee.setFirstName(rs.getString(FIRSTNAME_COL));
      employee.setLastName(rs.getString(LASTNAME_COL));
      return employee;
    }
  };

  @Override
  public Employee getEmployeeById(int id) {
    Map<String, Integer> paramMap = new HashMap<String, Integer>();
    paramMap.put("id", id);
    return getNamedParameterJdbcTemplate().queryForObject(
        SQL_SELECT_EMPLOYEE_BY_ID, paramMap, rowMapper);
  }

  @Override
  public List<Employee> getEmployeesByFirstName(String firstName) {
    Map<String, String> paramMap = new HashMap<String, String>();
    paramMap.put("firstName", firstName);
    return getNamedParameterJdbcTemplate().query(
        SQL_SELECT_EMPLOYEE_BY_FIRSTNAME, paramMap, rowMapper);
  }

  @Override
  public List<Employee> getEmployeesByLastName(String lastName) {
    Map<String, String> paramMap = new HashMap<String, String>();
    paramMap.put("lastName", lastName);
    return getNamedParameterJdbcTemplate().query(
        SQL_SELECT_EMPLOYEE_BY_LASTNAME, paramMap, rowMapper);
  }

  @Override
  public List<Employee> getEmployeesByFullName(String firstName, String lastName) {
    Map<String, String> paramMap = new HashMap<String, String>();
    paramMap.put("firstName", firstName);
    paramMap.put("lastName", lastName);
    return getNamedParameterJdbcTemplate().query(
        SQL_SELECT_EMPLOYEE_BY_FULLNAME, paramMap, rowMapper);
  }
  
  private int queryForIdentity() {
    return getJdbcTemplate().queryForObject("select LAST_INSERT_ID();", Integer.class);
  }

  @Override
  public int addEmployee(Employee employee) {
    Map<String, String> paramMap = new HashMap<String, String>();
    paramMap.put("firstName", employee.getFirstName());
    paramMap.put("lastName", employee.getLastName());
    getNamedParameterJdbcTemplate().update(SQL_INSERT_EMPLOYEE, paramMap);
    return queryForIdentity();
  }
}
