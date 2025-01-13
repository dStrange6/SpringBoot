package com.mayank.services.SpringDataJPA02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserProfile, Integer>
{
}
