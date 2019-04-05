package kg.myspring.FirstBoot.bootstap;

import kg.myspring.FirstBoot.model.Country;
import kg.myspring.FirstBoot.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author kasiom
 */
@Component
public class CountryBootstrap implements CommandLineRunner {
    private final CountryRepository countryRepository;

    public CountryBootstrap(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Country c1 = new Country();
        c1.setName("Россия");
        c1.setCountryOld("СССР");
        countryRepository.save(c1);

        Country c2 = new Country();
        c2.setName("Италия");
        c2.setCountryOld("Пьемонт");
        countryRepository.save(c2);

        Country c3 = new Country();
        c3.setName("Великобритания");
        c3.setCountryOld("Великобритания");
        countryRepository.save(c3);
    }
}
