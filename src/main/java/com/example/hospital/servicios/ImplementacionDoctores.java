package com.example.hospital.servicios;

import com.example.hospital.entidades.Doctores;
import com.example.hospital.repositorios.DoctoresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("implementacionDoctores")
public class ImplementacionDoctores {
    private DoctoresRepositorio doctoresRepositorio;

    @Autowired
    public ImplementacionDoctores(DoctoresRepositorio doctoresRepositorio){
        this.doctoresRepositorio = doctoresRepositorio;
    }

    public Doctores searchDoctoresByCodigo(int codigo){
        return doctoresRepositorio.searchDoctoresByCodigo(codigo);
    }

    public void guardar(Doctores doctor){
        doctoresRepositorio.save(doctor);
    }

    public List<Doctores> findAll(){
        return doctoresRepositorio.findAll();
    }
}
