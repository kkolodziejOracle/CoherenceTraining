package com.oracle.bzwbk.database.dao;

import com.oracle.coherence.model.Country;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kkolodzi on 2015-04-29.
 */

public interface CountryDao {
   public List<Country> selectAll();
}
