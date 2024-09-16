package com.example.pokeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pokeapi.model.Pokemon;
import com.example.pokeapi.repository.PokemonRepository;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Pokemon addPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public void deletePokemon(Integer id) {
        if (pokemonRepository.existsById(id)) {
            pokemonRepository.deleteById(id);
    }
}

}