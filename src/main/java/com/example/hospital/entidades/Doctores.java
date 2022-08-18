package com.example.hospital.entidades;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data //lombok (setters and Getters
@Entity
@Table (name = "TablaDoctores")
public class Doctores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    @Column(name = "Nombre",nullable = false,length = 25)
    private String nombre;
    @Column(name = "Apellido paterno",nullable = false,length = 25)
    private String paterno;
    @Column(name = "Apellido Materno",nullable = true,length = 25)
    private String materno;
    @Column(name = "Especialidad",nullable = false,length = 50)
    private String especialidad;


    public Object findAll() {
        return null;
    }
}
