package com.itesm.komorebi.controllers;

import com.itesm.komorebi.Service.PersonaService;
import com.itesm.komorebi.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/persona")

public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/perfil")
    public Persona getPerfil(){
            Persona p = new Persona();
            p.setNombre("Diego");
            p.setEdad(22);
            return p;
    }

    @PostMapping("/registrar")
    public Persona registrarPersona(@RequestBody Persona persona){
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        return persona;
    }
    @PostMapping("/cumplir-anios")
    public Persona cumplirAnios(@RequestBody Persona persona){
        personaService.cumplirAnios(persona);
        return persona;
    }
}
