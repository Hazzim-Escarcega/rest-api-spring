package atos.upgrade.apirest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//Habilitar CORS
@CrossOrigin("*")
//Indicarle a Spring que este sera nuestro REST controller
@RestController
//Indicarle a Spring que este sera el root del controlador
@RequestMapping("/")
public class ApiController {
    //Primer mapping
    @GetMapping("example")
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok("OK");
    }
}
