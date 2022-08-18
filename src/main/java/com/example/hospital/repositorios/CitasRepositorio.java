package com.example.hospital.repositorios;

import com.example.hospital.entidades.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitasRepositorio extends JpaRepository <Citas, Integer> {

}
