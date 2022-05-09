package atos.upgrade.apirest.utils.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

//STatus 404 custom ex

@ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public class ApiNotFound extends Exception {
    
    public ApiNotFound(String message) {
        super(message);
    }
}
