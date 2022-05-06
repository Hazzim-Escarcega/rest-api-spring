package atos.upgrade.apirest.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class UsersDTO implements Serializable {
    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private Date createdAt;
    private Date updatedAt;
    
}
