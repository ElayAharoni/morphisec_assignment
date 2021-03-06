package com.example.morphisecAssignment;

import java.time.*;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity
@Table
public class User {

    public static int numOfUsers;

    @Id
    @Column
    private final String _email;

    @Column
    private final LocalDateTime _registerTime;
    @Column
    private String _userName;
    @Column
    private int _loginCount;

    private boolean isOnline;
    

    public User(String email){
        this._email = email;
        this._registerTime = LocalDateTime.now();
        this._loginCount = 1;
        this.isOnline = true;
        numOfUsers++;
    }

    public static int getNumOfUsers(){
        return numOfUsers;
    }

    public String getEmail(){
        return this._email;
    }

    public LocalDateTime getRegisterTime(){
        return this._registerTime;
    } 

    public String getUserName(){
        return this._userName;
    }

    public int getLogincount(){
        return this._loginCount;
    }

    public boolean getIsOnline(){
        return this.isOnline;
    }

    public void setUserName(String newName){
        this._userName = newName;
    } 

    public void setIsOnline(boolean val){
        this.isOnline = val;
    }
}
