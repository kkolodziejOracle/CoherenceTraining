package com.oracle.bzwbk.database.dao;

import com.oracle.bzwbk.mapper.EmployeeMapper;
import com.oracle.bzwbk.sql.SqlQueries;
import com.oracle.coherence.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by kkolodzi on 2015-05-04.
 */
@Component
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    DataSource dataSource;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Employee> selectAll() {
        JdbcTemplate selectEmployee = new JdbcTemplate(dataSource);
        return selectEmployee.query(SqlQueries.EMPLOYEE_SQL,
                new EmployeeMapper());
    }
}
