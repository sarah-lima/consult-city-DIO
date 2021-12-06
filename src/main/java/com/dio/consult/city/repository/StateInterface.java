package com.dio.consult.city.repository;

import com.dio.consult.city.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateInterface extends JpaRepository<State, Long> {
}
