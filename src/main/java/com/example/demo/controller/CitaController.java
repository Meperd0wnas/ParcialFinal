package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CreateCitaRequest;
import com.example.demo.model.Cita;
import com.example.demo.service.CitaService;

@RestController
@RequestMapping("/citas")
public class CitaController {

        private CitaService citaService;
    
        
        public CitaController(CitaService citaService) {
            this.citaService = citaService;
    }


    @PostMapping
    public ResponseEntity<Cita> createClass(@RequestBody CreateCitaRequest request) {
        Cita newClass = citaService.createCita(request);
        return ResponseEntity.ok(newClass);
    }
}