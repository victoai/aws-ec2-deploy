package com.example.hiDeploy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hi")
    public  String   hello(){
        return  "hi ^ ^ Data";
    }
}
