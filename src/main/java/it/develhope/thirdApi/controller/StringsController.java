package it.develhope.thirdApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {
    @GetMapping(value = "/")
    public  String getString(@RequestParam String s1, @RequestParam(required = false) String s2){
        if(s2 == null){
            return s1;

        }else {
            return s1 + s2;
        }
    }

}
