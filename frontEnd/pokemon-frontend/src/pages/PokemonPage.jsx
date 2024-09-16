import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Card, Button, Container, Row, Col } from 'react-bootstrap';
// import NavigationBar from "./components/NavigationBar";
import '../App.css'; 

function PokemonPage() {
  const [pokemons, setPokemons] = useState([]);
  const [nextUrl, setNextUrl] = useState('http://localhost:8080/api/pokemon/all');
  const [error, setError] = useState(null);

  const fetchPokemons = async () => {
    try {
      const response = await axios.get(nextUrl); // Fetch the next batch of Pokémon
      const pokemonList = response.data.results;

      // Fetch detailed data for each Pokémon
      const detailedPokemons = await Promise.all(
        pokemonList.map(async (pokemon) => {
          const detailResponse = await axios.get(pokemon.url);
          return detailResponse.data;
        })
      );

      setPokemons(prev => [...prev, ...detailedPokemons]); // Append new Pokémon to the list
      setNextUrl(response.data.next); // Store the next URL for fetching more Pokémon
      setError(null);
    } catch (error) {
      console.error('Error fetching Pokémon data:', error);
      setError('Error fetching Pokémon data. Please try again later.');
    }
  };

  useEffect(() => {
    fetchPokemons(); 
  }, []);

  const handleLoadMore = () => {
    fetchPokemons(); 
  };

  const handleAdd = async (pokemon) => {
    try {
      const response = await axios.post('http://localhost:8080/repo/pokemon/add', {
        name: pokemon.name,
        imageUrl: pokemon.sprites.other['official-artwork'].front_default
      });
      console.log('Added Pokémon:', response.data);
    } catch (error) {
      console.error('Error adding Pokémon:', error);
    }
  };
  
  const handleDelete = async (pokemon) => {
    try {
      const response = await axios.delete(`http://localhost:8080/repo/pokemon/delete/${pokemon.id}`);
      console.log('Deleted Pokémon:', pokemon.name);
    } catch (error) {
      console.error('Error deleting Pokémon:', error);
    }
  };

  return (
    <>
      <Container className="mt-5">
        <Row>
          {error && <Col><p className="text-danger">{error}</p></Col>}
        </Row>
  
        <div className="cards-container">
          {pokemons.length > 0 ? (
            pokemons.map((pokemon) => (
              <Card key={pokemon.id} className="card">
                <Card.Img variant="top" src={pokemon.sprites.other['official-artwork'].front_default} alt={pokemon.name} />
                <Card.Body>
                  <Card.Title>{pokemon.name.charAt(0).toUpperCase() + pokemon.name.slice(1)}</Card.Title>
                  <Button variant="success" onClick={() => handleAdd(pokemon)}>Add to Favorites</Button>
                  <Button variant="danger" onClick={() => handleDelete(pokemon)} className="ms-2">Remove from Favorites</Button>
                </Card.Body>
              </Card>
            ))
          ) : (
            <p>No Pokémon available.</p>
          )}
        </div>

        {nextUrl && (
          <div className="text-center mt-4">
            <Button variant="primary" onClick={handleLoadMore}>Load More Pokémon</Button>
          </div>
        )}
      </Container>
    </>
  );
}

export default PokemonPage;
