package com.dio.consult.city.controller;

import com.dio.consult.city.model.Country;
import com.dio.consult.city.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    @GetMapping
    public Page<Country> getCountrues(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<Country> getOne(@PathVariable Long id){
        return repository.findById(id);
    }
}
