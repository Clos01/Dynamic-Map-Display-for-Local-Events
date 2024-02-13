package com.lavenmaps.lavenmapsproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// Synchronous Handling

@Controller
public class MapController {

    @Value("${api.key}")
    private String apiKey;

    // @RequestMapping(value = "/AutoAddress")
    // public String googleSearch(Model model) {
    // model.addAttribute("apiKey", apiKey);
    // return "AutoAddress";
    // } 

    // handling using Thymeleaf for html pages looks in the templates
    @RequestMapping(value = "/index")
    public String homePage() {
        return "index";
    }

    @RequestMapping(value = "/about")
    public String aboutPage() {
        return "about";
    }
    @RequestMapping(value = "/search")
    public String searchPage(Model model) {
        model.addAttribute("apiKey", apiKey);
        return "search";
    }
}
