package com.senai.projetowebsenai.service;

import com.senai.projetowebsenai.model.UserModel;
import com.senai.projetowebsenai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserModel> findAll(){
        return userRepository.findAll();
    }
}
