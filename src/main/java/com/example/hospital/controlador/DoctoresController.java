package com.example.hospital.controlador;

import com.example.hospital.entidades.Citas;
import com.example.hospital.entidades.Doctores;
import com.example.hospital.exception.BadRequest;
import com.example.hospital.servicios.ImplementacionCitas;
import com.example.hospital.servicios.ImplementacionDoctores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/doctores")
public class DoctoresController {

    private Doctores doctores;
    private ImplementacionDoctores implementacionDoctores;
    private ImplementacionCitas implementacionCitas;

    @Autowired
    public DoctoresController (ImplementacionDoctores implementacionDoctores, ImplementacionCitas implementacionCitas){
        this.implementacionDoctores = implementacionDoctores;
    }

    @RequestMapping("/index")
    public String index(Model model) throws BadRequest {

        List < Citas> list = implementacionCitas.findAll();
        if (list.isEmpty())
            throw new BadRequest("No existen doctores");
        return "doctores/index";
    }

    @GetMapping
    public String doctores(){
        return "D";
    }
}
