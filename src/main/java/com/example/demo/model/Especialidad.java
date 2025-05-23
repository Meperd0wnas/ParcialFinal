package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Especialidad {
    public String nombre;
    public String descripcion;
    public String doctor;
    public String ubicacion;
   
}
