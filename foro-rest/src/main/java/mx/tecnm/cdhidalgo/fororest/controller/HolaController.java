package mx.tecnm.cdhidalgo.fororest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaController {
    @GetMapping("/")
    public String saludo(){
        return "Hola Mundo"; 
    }

@GetMapping("version")
    public String version(){
        return "Esta es la version 1"; 
    }

    @GetMapping("adios")
    public String despedida(){
        return "Hasta la vista baby"; 
    }

}