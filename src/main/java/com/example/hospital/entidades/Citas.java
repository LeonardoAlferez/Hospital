package com.example.hospital.entidades;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data //lombok (setters and Getters
@Entity
@Table(name = "Citas")
public class Citas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cita;

    @ManyToOne
    @JoinColumn(name = "doctores_codigo", foreignKey = @ForeignKey(name = "FK_ID_DOCTOR"))
    private Doctores doctores;

    @ManyToOne
    @JoinColumn(name = "consultorios_codigo", foreignKey = @ForeignKey(name = "FK_ID_CONSULTORIO"))
    private Consultorios consultorios;

    @Column(name = "Horario de consulta",nullable = false, unique = true)
    private String horario_consulta;

    @Column(name = "Nombre del Paciente", nullable = false,unique = false)
    private  String paciente;
}
