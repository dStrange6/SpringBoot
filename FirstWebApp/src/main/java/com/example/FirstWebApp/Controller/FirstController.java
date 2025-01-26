    package com.example.FirstWebApp.Controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class FirstController
    {
        @RequestMapping("/welcome")
        public ModelAndView welcomePage()
        {
            ModelAndView mv = new ModelAndView();
            mv.addObject("welcome", "Hello !!! Welcome to my first web app...");
            mv.setViewName("index");  //LVN - logical view name -- view name without extension
            return mv;
        }
    }
