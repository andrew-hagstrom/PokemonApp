// package com.example.pokeapi.service;
// import java.util.List;
// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service; 

// import com.example.pokeapi.model.Pokemon;
// import com.example.pokeapi.model.User;
// import com.example.pokeapi.repository.PokemonRepository;
// import com.example.pokeapi.repository.UserRepository; 

// @Service
// public class UserService {

//     @Autowired
//     private UserRepository userRepository;

//     @Autowired
//     private PokemonRepository pokemonRepository;

//     // Add a Pokémon to a user
//     public User addPokemonToUser(Long userId, Long pokemonId) {
//         User user = userRepository.findById(userId)
//                 .orElseThrow(() -> new RuntimeException("User not found"));
//         Pokemon pokemon = pokemonRepository.findById(pokemonId)
//                 .orElseThrow(() -> new RuntimeException("Pokemon not found"));

//         user.getPokemon().add(pokemon);
//         return userRepository.save(user);
//     }

//     // Remove a Pokémon from a user
//     public User removePokemonFromUser(Long userId, Long pokemonId) {
//         User user = userRepository.findById(userId)
//                 .orElseThrow(() -> new RuntimeException("User not found"));
//         Pokemon pokemon = pokemonRepository.findById(pokemonId)
//                 .orElseThrow(() -> new RuntimeException("Pokemon not found"));

//         user.getPokemon().remove(pokemon);
//         return userRepository.save(user);
//     }

//     // Fetch all Pokémon for a user
//     public Set<Pokemon> getPokemonForUser(Long userId) {
//         User user = userRepository.findById(userId)
//                 .orElseThrow(() -> new RuntimeException("User not found"));

//         return user.getPokemon();
//     }

//     public List<User> getAllUsers() {
//         return userRepository.findAll();
//     }
// }


