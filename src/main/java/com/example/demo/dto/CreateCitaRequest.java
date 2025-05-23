package com.example.demo.dto;


import lombok.Data;

import com.example.demo.model.Especialidad;

@Data
public class CreateCitaRequest {

    public String nombre;
    public String cedula;
    public String correo;
    public Especialidad especialidad;
    public String fecha;
    public String hora;
    public String estado;
    public String resumen;   
    
}