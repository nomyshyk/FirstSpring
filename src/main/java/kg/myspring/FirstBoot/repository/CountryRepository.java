package kg.myspring.FirstBoot.repository;

import kg.myspring.FirstBoot.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kasiom
 */
public interface CountryRepository
        extends JpaRepository<Country, Long> {
}
