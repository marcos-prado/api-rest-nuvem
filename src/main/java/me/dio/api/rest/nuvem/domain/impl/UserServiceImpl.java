package me.dio.api.rest.nuvem.domain.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.api.rest.nuvem.domain.model.User;
import me.dio.api.rest.nuvem.domain.repository.UserRepository;
import me.dio.api.rest.nuvem.domain.service.UserService;

@Service
public class UserServiceImpl implements UserService {
   
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccontNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
            
        }
        return userRepository.save(userToCreate);
    }
    
}
