// package com.example.pokeapi.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.example.pokeapi.model.Pokemon;
// import com.example.pokeapi.model.UserPokemon;
// import com.example.pokeapi.repository.PokemonRepository;
// import com.example.pokeapi.repository.UserPokemonRepository;

// import java.util.List;
// import java.util.stream.Collectors;

// @Service
// public class UserPokemonService {

//     @Autowired
//     private UserPokemonRepository userPokemonRepository;

//     @Autowired
//     private PokemonRepository pokemonRepository;

//     public void addFavorite(Long userId, Long pokemonId) {
//         // Check if the favorite already exists
//         UserPokemon existingUserPokemon = userPokemonRepository.findByUserIdAndPokemonId(userId, pokemonId);
//         if (existingUserPokemon == null) {
//             UserPokemon userPokemon = new UserPokemon(userId, pokemonId);
//             userPokemonRepository.save(userPokemon);
//         }
//     }

//     public void removeFavorite(Long userId, Long pokemonId) {
//         // Find the UserPokemon entry
//         UserPokemon userPokemon = userPokemonRepository.findByUserIdAndPokemonId(userId, pokemonId);
//         if (userPokemon != null) {
//             userPokemonRepository.delete(userPokemon);
//         }
//     }

//     public List<Pokemon> getFavorites(Long userId) {
//         List<UserPokemon> userPokemons = userPokemonRepository.findByUserId(userId);
//         return userPokemons.stream()
//                            .map(userPokemon -> pokemonRepository.findById(userPokemon.getPokemonId()).orElse(null))
//                            .filter(pokemon -> pokemon != null) // Ensure no null values
//                            .collect(Collectors.toList());
//     }
// }
