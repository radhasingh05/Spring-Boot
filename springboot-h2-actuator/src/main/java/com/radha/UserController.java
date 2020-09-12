package com.radha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        System.out.println("testing");
        return (User)userService.save(user);
    }

    @GetMapping("/get")
    public Optional<User> findById(@RequestParam Integer userId){
        return userService.findById(userId);
    }

    @GetMapping("getAll")
    public List<User> findAll(){
        return userService.findAll();
    }


}
