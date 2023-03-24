package com.example.workshopreservas.repository;

import com.example.workshopreservas.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends CrudRepository<Cliente, Integer> {
}
