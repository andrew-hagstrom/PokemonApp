package com.example.pokeapi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/pokemon")
public class PokemonApiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public Map<String, Object> getAllPokemons() {
        String url = "https://pokeapi.co/api/v2/pokemon";
        return restTemplate.getForObject(url, Map.class);
    }
}

