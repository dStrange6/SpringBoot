package com.mayank.services.SpringDataJPA02.service;

import com.mayank.services.SpringDataJPA02.dao.UserProfile;
import com.mayank.services.SpringDataJPA02.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService
{

    @Autowired
    UserRepository repo;

    @Override
    public String registerUser(UserProfile userProfile)
    {
        return "User Profile create with ID : " + repo.save(userProfile).getId();
    }

    @Override
    public Optional<UserProfile> getUserById(Integer id) {
        return repo.findById(id);
    }
}
