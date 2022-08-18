package com.example.hospital.servicios;

import com.example.hospital.entidades.Citas;
import com.example.hospital.repositorios.CitasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("implementacionCitas")
public class ImplementacionCitas {

    private CitasRepositorio citasRepositorio;

    @Autowired
    public ImplementacionCitas(CitasRepositorio obj){
        citasRepositorio = obj;
    }

    public void guardar(Citas app){
        citasRepositorio.save(app);
    }

    public List<Citas> findAll(){
        return citasRepositorio.findAll();
    }
}
