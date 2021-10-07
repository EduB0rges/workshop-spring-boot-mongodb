package com.eduardoborges.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardoborges.workshopmongo.domain.User;
import com.eduardoborges.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return repo.findAll();
    }
}
