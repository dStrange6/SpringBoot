package com.mayank.thirdwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class UserController
{
    @GetMapping("/users")
    public String getUsers(Map<String, Object> model)
    {
        User user1 = new User(1, "John", "john@gmail.com");
        User user2 = new User(2, "Jane", "jane@gmail.com");
        User user3 = new User(3, "Bob", "bob@gmail.com");
        User user4 = new User(4, "Mary", "mary@gmail.com");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        model.put("users", users);

        return "index";
    }

    @GetMapping("/get")   //eg - localhost:8080/get?n=mayank
    public String getMessage( @RequestParam("n") String name,Map<String, Object> model)
    {
        model.put("message", "Hello " + name);
        return "message";
    }

    @GetMapping("/hello/{name}/{age}") //eg - localhost:8080/hello/mayank/23
    public String helloMessage(@PathVariable("name") String name, @PathVariable String age, Map<String, Object> model)
    {
        model.put("message", "Hello " + name + " Your age is " + age);
        return "message";
    }
}
