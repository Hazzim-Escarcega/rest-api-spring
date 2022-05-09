package atos.upgrade.apirest.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import atos.upgrade.apirest.entities.Users;

@Repository
public interface UsersDAO extends CrudRepository<Users, Integer> {
    
    @Transactional(readOnly = true)
    Optional<Users> findByUsername(String username);

    
}

    

