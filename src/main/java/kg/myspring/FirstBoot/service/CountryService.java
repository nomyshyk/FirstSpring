package kg.myspring.FirstBoot.service;

import kg.myspring.FirstBoot.model.Country;

import java.util.List;

/**
 * @author kasiom
 */

public interface CountryService {
    List<Country> findAllCountries();
    Country findCountryById(Long id);
    Country saveCountry(Country c);

}
