// package com.example.pokeapi.model;

// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;

// @Entity
// public class UserPokemon {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id; // You might need an @Id field depending on your DB schema

//     private Long userId;
//     private Long pokemonId;

//     // Default constructor
//     public UserPokemon() {}

//     // Constructor with arguments
//     public UserPokemon(Long userId, Long pokemonId) {
//         this.userId = userId;
//         this.pokemonId = pokemonId;
//     }

//     // Getters and setters
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Long getUserId() {
//         return userId;
//     }

//     public void setUserId(Long userId) {
//         this.userId = userId;
//     }

//     public Long getPokemonId() {
//         return pokemonId;
//     }

//     public void setPokemonId(Long pokemonId) {
//         this.pokemonId = pokemonId;
//     }
// }
