package mx.utng.sesion21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.utng.sesion21.model.Saludo;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public Saludo saludar(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo de Spring");
        return saludo;
    }
}

