package atos.upgrade.apirest.utils.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
//Excepcion personalizada de 422
@ResponseStatus(value = org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY)
public class ApiUnprocessableEntity extends Exception {
    
    public ApiUnprocessableEntity(String message) {
        super(message);
    }
    
    
}
