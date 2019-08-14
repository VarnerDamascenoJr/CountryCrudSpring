package com.lessons.lessons.controller;


import com.lessons.lessons.model.Country;
import com.lessons.lessons.service.CountryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    @GetMapping("/{countryId}")
    public Optional<Country> countryById(@PathVariable("countryId") int coutryId){
        return countryRepository.findById(coutryId);
    }
    @PutMapping("/update")
    public Country updateCountry(@RequestBody Country country){
        return countryRepository.save(country);
    }
    


}
