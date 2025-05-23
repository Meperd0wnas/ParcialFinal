package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "attendance")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cita {
    public String nombre;
    public String cedula;
    public String correo;
    public Especialidad especialidad;
    public String fecha;
    public String hora;
    public String estado;
    public String resumen;   
    
}
