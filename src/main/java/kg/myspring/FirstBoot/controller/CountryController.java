package kg.myspring.FirstBoot.controller;

import kg.myspring.FirstBoot.model.Country;
import kg.myspring.FirstBoot.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kasiom
 */
@RestController
@RequestMapping(CountryController.URLCOUNTRY)
public class CountryController {
    public static final String URLCOUNTRY = "/api/v1/country";

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getCountries(){
        return countryService.findAllCountries();
    }

    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable Long id){
        return countryService.findCountryById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Country saveCountry(@RequestBody Country c){
        return countryService.saveCountry(c);
    }
}
