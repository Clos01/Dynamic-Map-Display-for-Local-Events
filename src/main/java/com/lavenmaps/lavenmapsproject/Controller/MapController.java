package com.lavenmaps.lavenmapsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Synchronous Handling

@Controller
public class MapController {
    //handling using Thymeleaf  for html pages looks in the templates 
    @RequestMapping(value = "/index")
    public String homePage() {
        return "index";
    }

    @RequestMapping(value = "/about")
    public String aboutPage() {
        return "about";
    }
    @RequestMapping(value = "/search")
    public String searchPage() {
        return "search";
    }
}




