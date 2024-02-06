package com.lavenmaps.lavenmapsproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// Synchronous Handling
@RestController
public class MapController {

@RequestMapping("/")
public String homePage() {
    return "Hello Welcome to home page.";
}

@RequestMapping("/restaurants")
public String restaurants() {
    return "Here are some restaurants.";
}


}

