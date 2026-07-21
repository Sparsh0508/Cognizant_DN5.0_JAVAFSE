package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Search by containing text
    List<Country> findByNameContaining(String text);

    // Search by containing text in ascending order
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Search by starting alphabet
    List<Country> findByNameStartingWith(String alphabet);
}