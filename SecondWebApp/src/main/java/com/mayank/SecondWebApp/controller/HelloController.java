package com.mayank.SecondWebApp.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/controller")
public class HelloController
{
    @GetMapping("/home")
    public String homePage(Model model)
    {
        return "index";
    }

    @GetMapping("/greet")
    public String greetPage(Map<String, Object> model)  // spring will inject the model, HandlerMethodArgumentResolver is used by spring to resolve such arguments
    {
        model.put("message", "Hello World!");
        return "controller/hello";     // --> /controller/hello.jsp will be looked by spring i.e. hello.jsp will be looked inside controller folder
    }

//    @GetMapping("/hello")
//    public void indexPage()
//    {
//    }
    @GetMapping("/hello")          // "controller/hello" will be considered as the logical view name and view will be resolved to /controller/hello.jsp
    public Map<String, Object> newPage()
    {
        Map<String, Object> model = new HashMap<>();  // we have created the model
        model.put("message", "Hello from new page!");
        return model;
    }
//    @GetMapping("/user")
//    public void userPage(HttpServletResponse response) throws IOException {
//        PrintWriter writer = response.getWriter();
//        writer.println("<h1>Welcome to user Page.....</h1>");
//    }
    @GetMapping("/user")
    public String userPage(Map<String, Object> model)
    {
        User user = new User(1,"Mayank Pathak",25);
        model.put("user", user);   //adding user object
        return "user";
    }
}
