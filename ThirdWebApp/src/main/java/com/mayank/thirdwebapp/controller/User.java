package com.mayank.thirdwebapp.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User
{
    public Integer id;
    public String name;
    public String email;
}
