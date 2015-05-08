package com.oracle.bzwbk.dao;


import com.oracle.bzwbk.database.dao.CountryDao;
import com.oracle.bzwbk.database.dao.EmployeeDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-context.xml" })
public class DBConnectionTest {

    @Autowired
    CountryDao countryDao;
    @Autowired
    EmployeeDaoImpl employeeDao;

    @Test
    public void countryDbCountTest() throws InterruptedException {
        long countEntity = countryDao.selectAll().size();
        assertTrue(countEntity>0);
    }

    @Test
    public void employeeDbCountTest() throws InterruptedException {
        long countEntity = employeeDao.selectAll().size();
        assertTrue(countEntity>0);
    }


    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }



}