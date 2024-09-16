package com.example.pokeapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokeapi.model.Pokemon;
import com.example.pokeapi.service.PokemonService;

@RestController
@RequestMapping("/repo/pokemon")
public class PokemonRepoController {

    private final PokemonService pokemonService;

    public PokemonRepoController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/all")
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @PostMapping("/add")
    public ResponseEntity<Pokemon> addPokemon(@RequestBody Pokemon pokemon) {
        Pokemon savedPokemon = pokemonService.addPokemon(pokemon);
        return ResponseEntity.ok(savedPokemon);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePokemon(@PathVariable Integer id) {
        pokemonService.deletePokemon(id);
        return ResponseEntity.noContent().build();
    }
}
