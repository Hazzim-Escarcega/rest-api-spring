package atos.upgrade.apirest.services.interfaces;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import atos.upgrade.apirest.dto.UsersDTO;

@Service
public interface UserService {

    Page<UsersDTO> findAll(int page, int size);

    List<UsersDTO> findAll();

    UsersDTO findByUsername(String username);

    UsersDTO findById(int id);

    void save(UsersDTO user);

    void saveAll(List<UsersDTO> users);

    void deleteById(int userId);

}
