package com.arthur.swapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PlanetController.URL)
public class PlanetController {
    static final String URL = "/planets";

    @GetMapping
    public String list (){
        return "Planetas";
    }
}
