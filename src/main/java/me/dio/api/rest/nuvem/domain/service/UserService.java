package me.dio.api.rest.nuvem.domain.service;

import me.dio.api.rest.nuvem.domain.model.User;

public interface UserService {
    User findById(Long id);
    
    User create(User userToCreate);
    
    
}
