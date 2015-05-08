package com.oracle.bzwbk.main;

import com.oracle.bzwbk.coherence.dao.CountryCacheDao;
import com.oracle.bzwbk.coherence.dao.EmployeeCacheDao;
import com.oracle.bzwbk.database.dao.CountryDao;
import com.oracle.bzwbk.database.dao.EmployeeDaoImpl;
import com.oracle.coherence.model.Country;
import com.oracle.coherence.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kkolodzi on 2015-05-04.
 */
@Component
public class CachePopulator {
    @Autowired
    CountryCacheDao countryCacheDao;
    @Autowired
    EmployeeCacheDao employeeCacheDao;
    @Autowired
    CountryDao countryDao;
    @Autowired
    EmployeeDaoImpl employeeDao;

    public void populateCountry(){
        Map<String,Country> countryMap = new HashMap<String,Country>();
        List<Country> countries = countryDao.selectAll();
        for (Country country : countries) {
            countryMap.put(country.getCountryId(),country);
        }
        countryCacheDao.putAll(countryMap);
    }

    public void populateEmployee(){
        Map<Long,Employee> employeeMap = new HashMap<Long,Employee>();
        List<Employee> employees = employeeDao.selectAll();
        for (Employee employee : employees) {
            employeeMap.put(employee.getEmployeeId(),employee);
        }
        employeeCacheDao.putAll(employeeMap);
    }

    public void populate(){
        populateCountry();
        populateEmployee();
    }

}
