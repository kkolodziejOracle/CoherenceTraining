package com.oracle.bzwbk.database.dao;

import com.oracle.coherence.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kkolodzi on 2015-04-29.
 */
@Component
public interface EmployeeDao {
   public List<Employee> selectAll();
}
