package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Cita;


public interface citasRepository extends MongoRepository<Cita, String> {    

}