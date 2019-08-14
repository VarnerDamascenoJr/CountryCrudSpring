package com.lessons.lessons.service;

import com.lessons.lessons.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository  extends CrudRepository<Country, Integer> {
}
