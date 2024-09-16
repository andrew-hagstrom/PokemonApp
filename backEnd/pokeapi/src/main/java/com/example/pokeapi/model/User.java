// package com.example.pokeapi.model;
// import java.util.HashSet;
// import java.util.Set; 

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.JoinTable;
// import jakarta.persistence.ManyToMany;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "users")
// public class User {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
    
//     private Long userId;

//     @Column(nullable = false)
//     private String username;
    
//     @Column(nullable = false)
//     private String password;

//     @ManyToMany
//     @JoinTable(
//       name = "user_pokemon",
//       joinColumns = @JoinColumn(name = "user_id"),
//       inverseJoinColumns = @JoinColumn(name = "pokemon_id")
//     )
//     private Set<Pokemon> pokemon = new HashSet<>();

//     public User() {
//     }
  
//     public User(Long userId, String username, String password, Set<Pokemon> pokemon) {
//       this.userId = userId;
//       this.username = username;
//       this.password = password;
//       this.pokemon = pokemon;
//     }
//     // getters and setters

//   public Long getUserId() {
//     return this.userId;
//   }

//   public void setUserId(Long userId) {
//     this.userId = userId;
//   }

//   public String getUsername() {
//     return this.username;
//   }

//   public void setUsername(String username) {
//     this.username = username;
//   }

//   public String getPassword() {
//     return this.password;
//   }

//   public void setPassword(String password) {
//     this.password = password;
//   }

//   public Set<Pokemon> getPokemon() {
//     return this.pokemon;
//   }

//   public void setPokemon(Set<Pokemon> pokemon) {
//     this.pokemon = pokemon;
//   }

// }

