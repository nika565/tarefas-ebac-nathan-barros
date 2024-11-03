package com.nathan.crud.service;

import com.nathan.crud.model.User;
import com.nathan.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Salvar
    public User saveUser(User user){
        return userRepository.save(user);
    }

    // Buscar
    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findOneUser(Long id){
        return userRepository.findById(id);
    }

    // Editar
    public User updateUser(Long id, User user){
        Optional<User> userToUpdate = this.findOneUser(id);

        if(userToUpdate.isPresent()){
            User existingUser = userToUpdate.get();
            existingUser.setNome(user.getNome());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        }
        return null;
    }

    // Deletar
    public boolean deleteOne(Long id){
        if (userRepository.existsById(id)) {  // Verifica se o usuário existe antes de tentar deletar
            userRepository.deleteById(id);
            return !userRepository.existsById(id);  // Retorna true se o usuário não existir mais
        }
        return false;

    }

}
