package atos.upgrade.apirest.validator;

import org.springframework.stereotype.Service;

import atos.upgrade.apirest.dto.UserRequest;
import atos.upgrade.apirest.utils.exceptions.ApiUnprocessableEntity;

@Service
public interface UserValidator {
    void validator(UserRequest request) throws ApiUnprocessableEntity;
        
    }
