package com.oracle.bzwbk.mapper;

import com.oracle.coherence.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kkolodzi on 2015-04-30.
 */
public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getLong(1));
        employee.setDepartmentId(resultSet.getLong(2));
        employee.setJobId(resultSet.getString(3));
        employee.setFirstName(resultSet.getString(4));
        employee.setLastName(resultSet.getString(5));
        employee.setEmail(resultSet.getString(6));
        employee.setPhoneNumber(resultSet.getString(7));
        employee.setSalary(resultSet.getLong(8));
        employee.setHireDate(resultSet.getDate(9));
        employee.setCommissionPct(resultSet.getLong(10));
        return employee;
    }
}
