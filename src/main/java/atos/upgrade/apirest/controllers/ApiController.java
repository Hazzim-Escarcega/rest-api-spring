package atos.upgrade.apirest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ApiController {
    @GetMapping("example")
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok("OK");
    }
}
