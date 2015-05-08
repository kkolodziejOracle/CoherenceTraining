package com.oracle.bzwbk.dao;


import com.oracle.bzwbk.coherence.dao.CountryCacheDao;
import com.oracle.bzwbk.coherence.dao.EmployeeCacheDao;
import com.oracle.bzwbk.main.CachePopulator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-context.xml" })
public class PopulateTest {

    @Autowired
    CountryCacheDao countryCacheDao;
    @Autowired
    EmployeeCacheDao employeeCacheDao;
    @Autowired
    CachePopulator cachePopulator;



    @Test
    public void countryPopulateTest() throws InterruptedException {
        countryCacheDao.clear();
        cachePopulator.populateCountry();
        assertTrue(!countryCacheDao.isEmpty());
    }

    @Test
    public void employeePopulateTest() throws InterruptedException {
        employeeCacheDao.clear();
        cachePopulator.populateEmployee();
        assertTrue(!employeeCacheDao.isEmpty());
    }

}