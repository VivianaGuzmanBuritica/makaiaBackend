package com.example.workshopreservas.repository;

import com.example.workshopreservas.entity.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
}
