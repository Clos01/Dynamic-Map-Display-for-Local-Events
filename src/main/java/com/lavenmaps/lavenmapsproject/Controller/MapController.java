package com.lavenmaps.lavenmapsproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Synchronous Handling
@RestController
public class MapController {

@RequestMapping(value = "/index.html")
public String homePage() {
    return "index";
}

@RequestMapping("/restaurants")
public String restaurants() {
    return "Here are some restaurants.";
}
}