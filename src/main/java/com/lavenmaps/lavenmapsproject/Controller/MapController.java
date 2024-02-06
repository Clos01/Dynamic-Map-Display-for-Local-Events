package com.lavenmaps.lavenmapsproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
    @RequestMapping(value="")
@ResponseBody
public String index(){
    return "Hello World";
}
}
