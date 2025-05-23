package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Cita;


public interface CitasRepository extends MongoRepository<Cita, String> {

    boolean existsByDateAndTimeSlot(String fecha, String hora);    

}