package com.chris.adminpanelservices.controller;

import com.chris.adminpanelservices.entity.User;
import com.chris.adminpanelservices.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
public class UserController {

    private UsersRepo usersRepo;

    @Autowired
    public UserController(UsersRepo usersRepo){
        this.usersRepo = usersRepo;
    }

    @GetMapping("/get-users-info")
    public List<User> showUsersCount(){
        return usersRepo.findAll();
    }

    @GetMapping("/get-user-count")
    public int userCount(){
        return usersRepo.findAll().size();
    }
}
