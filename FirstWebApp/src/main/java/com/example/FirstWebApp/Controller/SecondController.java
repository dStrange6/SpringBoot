package com.example.FirstWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/controller2")
public class SecondController
{
    @GetMapping("/hello")
    public String displayMessage(Model model)
    {
        System.out.println(model.getClass().getName());
        model.addAttribute("key", "Hello !!! Welcome to my web page");
        return "home";
    }

    @GetMapping("/alert")
    public String displayAlert(Map<String, Object> map)
    {
        System.out.println(map.getClass().getName());
        map.put("key", "Alerttttttttttt !!!!!!");
        return "home";
    }
}
