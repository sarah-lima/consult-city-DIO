package com.dio.consult.city.controller;

import com.dio.consult.city.model.State;
import com.dio.consult.city.repository.StateInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/state")
public class StateResource {
    private StateInterface repository;

    @GetMapping
    public Page<State> getCountrues(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<State> getOne(@PathVariable Long id){
        return repository.findById(id);
    }
}
