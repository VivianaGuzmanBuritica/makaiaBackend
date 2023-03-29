package com.example.workshopreservas.repository;

import com.example.workshopreservas.entity.Reserva;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {

    @Modifying
    @Query(value= "select * from  reserva where fecha not like fecha=:fecha", nativeQuery = true)
    void disponibilidad(@Param("fecha") Date fecha);
}
