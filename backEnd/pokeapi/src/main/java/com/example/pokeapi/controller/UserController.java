// package com.example.pokeapi.controller;
// import java.util.List; 
// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity; 
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.pokeapi.model.Pokemon;
// import com.example.pokeapi.model.User;
// import com.example.pokeapi.service.UserService;
 
// @RestController
// @RequestMapping("/users")
// public class UserController {

//     @Autowired
//     private UserService userService;

//     // Add a Pokémon to a user
//     @PostMapping("/{userId}/pokemon/{pokemonId}")
//     public ResponseEntity<User> addPokemonToUser(@PathVariable Long userId, @PathVariable Long pokemonId) {
//         User updatedUser = userService.addPokemonToUser(userId, pokemonId);
//         return ResponseEntity.ok(updatedUser);
//     }

//     // Remove a Pokémon from a user
//     @DeleteMapping("/{userId}/pokemon/{pokemonId}")
//     public ResponseEntity<User> removePokemonFromUser(@PathVariable Long userId, @PathVariable Long pokemonId) {
//         User updatedUser = userService.removePokemonFromUser(userId, pokemonId);
//         return ResponseEntity.ok(updatedUser);
//     }

//     // Fetch all Pokémon for a user
//     @GetMapping("/{userId}/pokemon")
//     public ResponseEntity<Set<Pokemon>> getPokemonForUser(@PathVariable Long userId) {
//         Set<Pokemon> pokemon = userService.getPokemonForUser(userId);
//         return ResponseEntity.ok(pokemon);
//     }

//     // Get all users
//     @GetMapping
//     public ResponseEntity<List<User>> getAllUsers() {
//         List<User> users = userService.getAllUsers();
//         return ResponseEntity.ok(users);
//     }
// }


