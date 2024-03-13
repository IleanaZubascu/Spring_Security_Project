package com.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("hello")
public class HelloSpringController {
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye()
    {
        return "Goodbye, Spring!";
    }


    //Handles request of the form /hello? name=LaunchCode
    @RequestMapping(value="hello",method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model)
    {
      String greeting="Hello, "+ name + "!";
      model.addAttribute("greeting", greeting);
      return "hello";
    }

    //Handles request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloPathParam(@PathVariable String name,Model model)
    {
        String greeting="Hello, "+ name+ "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }


    @GetMapping("form")
    public String helloForm()
    {
        return "form";
    }


    @GetMapping("hello-names")
    public String helloNames(Model model)
    {
        List<String> names=new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaFX");
        model.addAttribute("names", names);
        return "hello-list";
    }
}
