package com.dio.consult.city.repository;

import com.dio.consult.city.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
