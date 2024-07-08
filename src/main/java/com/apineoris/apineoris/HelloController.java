package com.apineoris.apineoris;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @RequestMapping("/Hello")
    public String Hello(){
        return "hola mundo ";
    }
}
