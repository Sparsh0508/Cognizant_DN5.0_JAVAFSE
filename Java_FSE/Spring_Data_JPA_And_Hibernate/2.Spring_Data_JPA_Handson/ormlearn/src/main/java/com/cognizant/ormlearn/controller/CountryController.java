package com.cognizant.ormlearn.controller;

import com.cognizant.ormlearn.entity.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/search")
    public List<Country> searchCountry(@RequestParam String text) {
        return countryService.searchCountry(text);
    }

    @GetMapping("/search/sorted")
    public List<Country> searchCountrySorted(@RequestParam String text) {
        return countryService.searchCountrySorted(text);
    }

    @GetMapping("/starts")
    public List<Country> searchCountryStartingWith(@RequestParam String alphabet) {
        return countryService.searchCountryStartingWith(alphabet);
    }

    @PostMapping
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }
}