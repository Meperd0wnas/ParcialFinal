# ParcialFinal

API REST para gestionar citas de usuarios.

## Tecnologías

* Java 17+
* Spring Boot
* Lombok
* Spring Data MongoDB
* JUnit 5 + Mockito
* Maven (o Gradle)


## Entidades modelo
* Cita
* Especialidad


### Cita 

```java
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
```

**JSON de ejemplo**:

```

### Especialidad

```java
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Especialidad {
    public String nombre;
    public String descripcion;
    public String doctor;
    public String ubicacion;
   
}
```

**JSON de ejemplo**:

```


## DTOs

* **CreateCitaRequest**:


---

## Endpoints


---

## Puesta en marcha

```bash
mvn spring-boot:run
```

## Tests

Ejecutar:

```bash
mvn test
```
