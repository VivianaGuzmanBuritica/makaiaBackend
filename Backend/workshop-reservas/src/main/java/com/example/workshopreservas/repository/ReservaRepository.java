package com.example.workshopreservas.repository;

import com.example.workshopreservas.entity.Habitacion;
import com.example.workshopreservas.entity.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {


    @Query(value= "SELECT count(*) FROM RESERVA where numero=:numero and fecha=:fecha", nativeQuery = true)
    public Integer disponibilidadQuery(@Param("numero") Integer numero, @Param("fecha") Date fecha);
}
