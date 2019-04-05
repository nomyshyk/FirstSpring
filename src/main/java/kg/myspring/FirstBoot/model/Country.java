package kg.myspring.FirstBoot.model;

import javax.persistence.*;

/**
 * @author kasiom
 */
@Entity
@Table(name = "country_al")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String countryOld;

    public Country() {
    }

    public Country(Long id, String name, String countryOld) {
        this.id = id;
        this.name = name;
        this.countryOld = countryOld;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOld() {
        return countryOld;
    }

    public void setCountryOld(String countryOld) {
        this.countryOld = countryOld;
    }
}
