package com.xworkz.country;

public class Country
{
    String name;
    long population;
    String currency;
    String language;
    PrimeMinister primeMinister;

    public Country(String name,long population,String currency,String language)
    {
        this.name=name;
        this.population=population;
        this.currency=currency;
        this.language=language;
        this.primeMinister=new PrimeMinister("India",65,"BJP",10);
    }
    public void display()
    {
        System.out.println("Country Name: " +name);
        System.out.println("Population: " +population);
        System.out.println("Country currency: " +currency);
        System.out.println("Language: " +language);
        primeMinister.display();
    }
}
