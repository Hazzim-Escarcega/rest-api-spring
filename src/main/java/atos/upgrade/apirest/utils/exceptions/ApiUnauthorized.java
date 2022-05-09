package atos.upgrade.apirest.utils.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

//Status 401 custom exception

@ResponseStatus(value = org.springframework.http.HttpStatus.UNAUTHORIZED)
public class ApiUnauthorized extends Exception {
    
    public ApiUnauthorized(String message) {
        super(message);
    }
}
