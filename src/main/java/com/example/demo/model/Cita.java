package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cita {
    public String nombre;
    public String cedula;
    public String correo;
    public Especialidad especialidad;
    public String resumen;   
    

}
