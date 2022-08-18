package com.example.hospital.repositorios;

import com.example.hospital.entidades.Consultorios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepositorio extends CrudRepository<Consultorios, Integer> {
}
