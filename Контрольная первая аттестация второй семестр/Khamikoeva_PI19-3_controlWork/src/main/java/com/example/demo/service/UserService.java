package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void create(User user){
        userRepository.save(user);
    }

    public User update(User user, User userFromDB){
        BeanUtils.copyProperties(user, userFromDB, "id");
        return userRepository.save(user);
    }

    public boolean delete(User user) {
        if (user != null){
            userRepository.delete(user);
            return true;
        }
        return false;
    }
}
