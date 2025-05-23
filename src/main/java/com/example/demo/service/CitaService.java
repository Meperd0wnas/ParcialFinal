package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CreateCitaRequest;
import com.example.demo.model.Cita;
import com.example.demo.repository.CitasRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class CitaService {
    private final CitasRepository citasRepository;


    public Cita createCita(CreateCitaRequest request) {
        if (citasRepository.existsByDateAndTimeSlot(request.getFecha(), request.getHora())) {
            throw new RuntimeException("Ya existe una cita programada en este horario");
        }
                return null;

}


}