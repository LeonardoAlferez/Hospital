package com.example.hospital.entidades;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data //lombok (setters and Getters
@Entity
@Table(name = "TablaConsultorios")
public class Consultorios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Consultorio")
    private Integer codigo;

    @Column(name = "Numero de piso", nullable = false, length = 2, unique = false)
    private Integer piso;
}
