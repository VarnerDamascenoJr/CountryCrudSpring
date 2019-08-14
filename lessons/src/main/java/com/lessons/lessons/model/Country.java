package com.lessons.lessons.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country-master")
public class Country {

    @Id
    @Column(name = "country_id")
    private int countryId;
    @Column(name = "country_name")
    private String countryName;
    @Column(name ="country_lang")
    private String countryLang;
    @Column(name = "coutry_population")
    private int countryPopulation;


    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLang() {
        return countryLang;
    }

    public void setCountryLang(String countryLang) {
        this.countryLang = countryLang;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }
}
