package kg.myspring.FirstBoot.service;

import kg.myspring.FirstBoot.model.Country;
import kg.myspring.FirstBoot.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kasiom
 */
@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country findCountryById(Long id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country saveCountry(Country c) {
        return countryRepository.save(c);
    }
}
