package com.example.hospital.repositorios;

import com.example.hospital.entidades.Doctores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("doctoresRepositorio")
public interface DoctoresRepositorio extends CrudRepository<Doctores, Long> {
        Doctores searchDoctoresByCodigo(int codigo);
        List<Doctores> findAll();
}
