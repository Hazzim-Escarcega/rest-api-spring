package atos.upgrade.apirest.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import atos.upgrade.apirest.dto.UsersDTO;
import atos.upgrade.apirest.entities.Users;
import atos.upgrade.apirest.repository.UsersDAO;
import atos.upgrade.apirest.services.interfaces.UserService;
import atos.upgrade.apirest.utils.MHelpers;

@Component
public class UsersImplement implements UserService {


    @Autowired
    private UsersDAO usersDAO;

    @Override
    public Page<UsersDTO> findAll(int page, int size) {
        Page<Users> users = this.usersDAO.findAll();
        
        return users.map(this::convertToUsersDTO);
    }

    @Override
    public List<UsersDTO> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsersDTO findByUsername(String username) {

        Optional<Users> users = this.usersDAO.findByUsername(username);

        if (!users.isPresent()) {
            return null;
        }
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
    }

    @Override
    public UsersDTO findById(int userId) {
        Optional<Users> users = this.usersDAO.findById(userId);

        if (!users.isPresent()) {
            return null;
        }
        return MHelpers.modelMapper().map(users.get(), UsersDTO.class);
    }

    @Override
    public void save(UsersDTO user) {

        Users users = MHelpers.modelMapper().map(user, Users.class);
        this.usersDAO.save(users);
        
    }

    @Override
    public void saveAll(List<UsersDTO> users) {
        List<Users> u = new ArrayList<>();
        for (UsersDTO user : users) {
            Users us = MHelpers.modelMapper().map(user, Users.class);
            u.add(us);
        }
        this.usersDAO.saveAll(u);
        
    }

    @Override
    public void deleteById(int userId) {
        this.usersDAO.deleteById(userId);        
    }
    
    private UsersDTO convertToUsersDTO(final Users users){
        return MHelpers.modelMapper().map(users, UsersDTO.class);
    }
}