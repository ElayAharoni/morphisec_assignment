package com.example.morphisecAssignment;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  


@Service
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>();
        usersRepository.findAll().forEach(user->users.add(user));
        return users;
    }

    public User getUserByEmail(String email){
        return usersRepository.findById(email).get();
    }

    public void saveOrUpdate(User user){
        usersRepository.save(user);
    }

    public void delete(String email){
        usersRepository.deleteById(email);
    }
    
}
