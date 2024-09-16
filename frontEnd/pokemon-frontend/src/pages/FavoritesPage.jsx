// src/pages/FavoritesPage.js
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Card, Button, Container, Row, Col } from 'react-bootstrap';
import NavigationBar from '../components/NavigationBar';
import '../App.css'; 

function FavoritesPage() {
  const [favorites, setFavorites] = useState([]);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchFavorites = async () => {
      try {
        const response = await axios.get('http://localhost:8080/repo/pokemon/all'); 
        setFavorites(response.data);
        setError(null);
      } catch (error) {
        console.error('Error fetching favorite Pokémon:', error);
        setError('Error fetching favorite Pokémon. Please try again later.');
      }
    };

    fetchFavorites();
  }, []);

  const handleDelete = async (pokemon) => {
    try {
      await axios.delete(`http://localhost:8080/repo/pokemon/delete/${pokemon.id}`);
      setFavorites(favorites.filter(fav => fav.id !== pokemon.id));
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
          {favorites.length > 0 ? (
            favorites.map((pokemon) => (
              <Card key={pokemon.id} className="card">
                <Card.Img variant="top" src={pokemon.imageUrl} alt={pokemon.name} />
                <Card.Body>
                  <Card.Title>{pokemon.name.charAt(0).toUpperCase() + pokemon.name.slice(1)}</Card.Title>
                  <Button variant="danger" onClick={() => handleDelete(pokemon)}>Remove from Favorites</Button>
                </Card.Body>
              </Card>
            ))
          ) : (
            <p>No favorites available.</p>
          )}
        </div>
      </Container>
    </>
  );
}

export default FavoritesPage;
