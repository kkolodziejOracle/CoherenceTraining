package com.oracle.bzwbk.mapper;

import com.oracle.coherence.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kkolodzi on 2015-04-30.
 */
public class CountryMapper implements RowMapper<Country> {
    @Override
    public Country mapRow(ResultSet resultSet, int i) throws SQLException {
        Country country = new Country();
        country.setCountryId(resultSet.getString(1));
        country.setCountryName(resultSet.getString(2));
        country.setRegionId(resultSet.getLong(3));
        return country;
    }
}
