package atos.upgrade.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import atos.upgrade.apirest.dto.UserRequest;
import atos.upgrade.apirest.services.interfaces.UserService;
import atos.upgrade.apirest.utils.exceptions.ApiUnprocessableEntity;
import atos.upgrade.apirest.validator.UserValidatorImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class ApiController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserValidatorImpl userValidator;

    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping(value = "/by/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByUsername(@PathVariable("username") String username) {

        return ResponseEntity.ok(userService.findByUsername(username));

    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveUser(@RequestBody UserRequest request) throws ApiUnprocessableEntity {
        userValidator.validator(request);
        userService.save(request);
        return ResponseEntity.ok(Boolean.TRUE);

    }
}