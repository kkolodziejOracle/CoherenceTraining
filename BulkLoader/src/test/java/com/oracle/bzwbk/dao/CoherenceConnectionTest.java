package com.oracle.bzwbk.dao;


import com.oracle.bzwbk.coherence.dao.CountryCacheDao;
import com.oracle.bzwbk.coherence.dao.EmployeeCacheDao;
import com.oracle.bzwbk.database.dao.CountryDao;
import com.oracle.bzwbk.database.dao.EmployeeDaoImpl;
import com.oracle.coherence.model.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-context.xml" })
public class CoherenceConnectionTest {

    @Autowired
    CountryCacheDao countryDao;
    @Autowired
    EmployeeCacheDao employeeDao;

    @Test
    public void countryCacheTest() throws InterruptedException {
        countryDao.clear();
        assertTrue(countryDao.isEmpty());
    }

    @Test
    public void employeeCacheTest() throws InterruptedException {
        employeeDao.clear();
        assertTrue(employeeDao.isEmpty());
    }

}