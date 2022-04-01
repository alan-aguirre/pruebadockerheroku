package com.itesm.komorebi.Service;


import com.itesm.komorebi.models.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    public Persona cumplirAnios(Persona p){
        p.setEdad(p.getEdad()+1);
        return p;
    }
}
