package com.example.morphisecAssignment;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  


@RestController
public class UsersController {
    @Autowired
    private static final UserService userService = new UserService();
    
    @GetMapping("/User")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/User/{email}")
    public User getUser(@PathVariable("email") String email){
        return userService.getUserByEmail(email);
    }

    @DeleteMapping("/User/{emai}")
    public void deleteUser(@PathVariable("email")String email){
        userService.delete(email);
    }

    @PostMapping("/User")
    public String saveUser(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user.getEmail();
    }
}
