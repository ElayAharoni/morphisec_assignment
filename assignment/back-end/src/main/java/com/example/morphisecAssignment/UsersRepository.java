package com.example.morphisecAssignment;

import org.springframework.data.repository.CrudRepository;  


public interface UsersRepository extends CrudRepository<User, String>  {
    
}
