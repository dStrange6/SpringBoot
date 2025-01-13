package com.mayank.services.SpringDataJPA02.service;

import com.mayank.services.SpringDataJPA02.dao.UserProfile;

import java.util.Optional;

public interface IUserService
{
    public String registerUser(UserProfile userProfile);
    public Optional<UserProfile> getUserById(Integer id);
}
