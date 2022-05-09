package atos.upgrade.apirest.validator;

import org.springframework.stereotype.Component;

import atos.upgrade.apirest.dto.UserRequest;
import atos.upgrade.apirest.utils.exceptions.ApiUnprocessableEntity;

@Component
public class UserValidatorImpl implements UserValidator{

    


    @Override
    public void validator(UserRequest request) throws ApiUnprocessableEntity {
        if (request.getFirstname() == null || request.getFirstname().isEmpty()) {
            throw new ApiUnprocessableEntity("Firstname is required");
    }
        if (request.getFirstname().length() < 3) {
            throw new ApiUnprocessableEntity("Firstname must be larger than 3 characters");
        
    }
        if (request.getLastname() == null || request.getLastname().isEmpty()) {
            throw new ApiUnprocessableEntity("Lastname is required");
        }
        if (request.getLastname().length() < 3) {
            throw new ApiUnprocessableEntity("Lastname must be larger than 3 characters");
        }
        if (request.getUsername() == null || request.getUsername().isEmpty()) {
            throw new ApiUnprocessableEntity("Username is required");
        }
        if (request.getUsername().length() < 3) {
            throw new ApiUnprocessableEntity("Username must be larger than 3 characters");
        }
        if (request.getPassword() == null || request.getPassword().isEmpty()) {
            throw new ApiUnprocessableEntity("Password is required");
        }
        if (request.getPassword().length() < 8) {
            throw new ApiUnprocessableEntity("Password must be larger than 8 characters");
        }
}
}
    
