package com.pujitha.spring;

import java.util.Properties;

public class CountriesAndLanguages {
    private Properties countryAndLanguages;

    public Properties getCountryAndLanguages() {
        return countryAndLanguages;
    }

    public void setCountryAndLanguages(Properties countryAndLanguages) {
        this.countryAndLanguages = countryAndLanguages;
    }

    @Override
    public String toString() {
        return "CountriesAndLanguages{" +
                "countryAndLanguages=" + countryAndLanguages +
                '}';
    }
}
