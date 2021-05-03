package com.wildcodeschool.Doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/doctor")
public class DoctorController {

    @GetMapping("/1")
    @ResponseBody
    public String WilliamHartnell(){
        return "William Hartnell";
    }
    @GetMapping("/10")
    @ResponseBody
    public String DavidTennant(){
        return "David Tennant";
    }
    @GetMapping("/13")
    @ResponseBody
    public String JodieWhittaker(){
        return "Jodie Whittaker";
    }
}
