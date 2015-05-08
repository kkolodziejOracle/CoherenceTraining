package com.oracle.bzwbk.database.dao;

import com.oracle.bzwbk.mapper.CountryMapper;
import com.oracle.bzwbk.sql.SqlQueries;
import com.oracle.coherence.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by kkolodzi on 2015-05-04.
 */
@Component
public class CountryDaoImpl implements CountryDao{
    @Autowired
    DataSource dataSource;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Country> selectAll() {
        JdbcTemplate selectCountry = new JdbcTemplate(dataSource);
        return selectCountry.query(SqlQueries.COUNTRY_SQL,
                new CountryMapper());
    }
}
