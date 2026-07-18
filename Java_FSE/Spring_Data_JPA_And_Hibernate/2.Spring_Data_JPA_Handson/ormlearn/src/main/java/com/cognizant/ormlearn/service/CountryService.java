package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public List<Country> searchCountry(String text) {
        return countryRepository.findByNameContaining(text);
    }

    public List<Country> searchCountrySorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    public List<Country> searchCountryStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWith(alphabet);
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }
}