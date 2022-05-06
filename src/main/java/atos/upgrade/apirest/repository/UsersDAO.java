package atos.upgrade.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import atos.upgrade.apirest.entities.Users;

@Repository
public interface UsersDAO extends CrudRepository<Users, Integer> {

}

    

