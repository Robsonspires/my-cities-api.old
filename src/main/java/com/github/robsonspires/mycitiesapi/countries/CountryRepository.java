package com.github.robsonspires.mycitiesapi.countries;

import com.github.robsonspires.mycitiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}