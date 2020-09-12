package com.radha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return (User)userRepository.save(user);
    }

    public Optional<User> findById(Integer userId){
        return userRepository.findById(userId);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }




}
