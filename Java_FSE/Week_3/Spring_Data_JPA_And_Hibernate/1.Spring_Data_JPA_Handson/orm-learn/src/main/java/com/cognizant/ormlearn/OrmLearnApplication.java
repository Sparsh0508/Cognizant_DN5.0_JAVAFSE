package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);

//		testGetAllCountries();
//		testGetCountry();
//		testAddCountry();
//		testUpdateCountry();
//		testDeleteCountry();
		testSearchCountry();
	}


	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.info("Countries : {}", countries);

		LOGGER.info("End");
	}
	private static void testGetCountry() {

		LOGGER.info("Start");

		Country country = countryService.getCountry("IN");

		LOGGER.info("Country : {}", country);

		LOGGER.info("End");
	}
	private static void testAddCountry() {

		Country country = new Country("IT","Italy");

		countryService.addCountry(country);

		LOGGER.info("Italy Added");
	}
	private static void testUpdateCountry() {

		Country country = new Country("IN","Bharat");

		countryService.updateCountry(country);

		LOGGER.info("Updated");
	}
	private static void testDeleteCountry() {

		countryService.deleteCountry("IT");

		LOGGER.info("Deleted");
	}
	private static void testSearchCountry() {

		LOGGER.info("Start");

		System.out.println(countryService.searchCountry("an"));

		LOGGER.info("End");
	}
}