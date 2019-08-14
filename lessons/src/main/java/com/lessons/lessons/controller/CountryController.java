package com.lessons.lessons.controller;


import com.lessons.lessons.model.Country;
import com.lessons.lessons.service.CountryRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {
  CountryRepository countryRepository;

  //this part for insertion of the datas
    @PostMapping("/add")
    public Country addCountry(@RequestBody Country country){
        return countryRepository.save(country);
    }
    @GetMapping("/all")
    public Iterable<Country> allCountry(){
        return countryRepository.findAll();
    }

}
