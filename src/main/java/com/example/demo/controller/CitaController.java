package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cita;
import com.example.demo.service.CitaService;

@RestController
@RequestMapping("/citas")
public class CitaController {

    private final CitaService service;


    public CitaController(CitaService service) {
        this.service = service;
    }


}