


// import 'bootstrap/dist/css/bootstrap.min.css';
// import React, { useState } from 'react';
// import axios from 'axios';
// import { Card, Button, Container, Row, Col, Form } from 'react-bootstrap';
// import NavigationBar from './components/navbar';

// function App() {
//   const [pokemonName, setPokemonName] = useState('');
//   const [pokemonImage, setPokemonImage] = useState('');
//   const [error, setError] = useState(null);

//   const fetchPokemon = async () => {
//     try {
//       const response = await axios.get(`http://localhost:8080/api/pokemon?name=${pokemonName}`);
//       setPokemonImage(response.data.sprites.front_default);
//       setError(null);
//     } catch (error) {
//       console.error('Error fetching Pokémon data:', error);
//       setError('Pokémon not found. Please try another name.');
//       setPokemonImage('');
//     }
//   };

//   return (
//     <>
//     <NavigationBar/>
//     <Container className="mt-5">
//       <Row className="justify-content-center">
//         <Col md={6}>
//           <Form.Group controlId="pokemonName">
//             <Form.Control
//               type="text"
//               value={pokemonName}
//               onChange={(e) => setPokemonName(e.target.value)}
//               placeholder="Enter Pokémon name"
//             />
//           </Form.Group>
//           <Button className="mt-2" onClick={fetchPokemon} variant="primary">
//             Fetch Pokémon
//           </Button>

//           {error && <p className="text-danger mt-3">{error}</p>}

//           {pokemonImage && (
//             <Card className="mt-3">
//               <Card.Img variant="top" src={pokemonImage} alt={pokemonName} />
//               <Card.Body>
//                 <Card.Title>{pokemonName.charAt(0).toUpperCase() + pokemonName.slice(1)}</Card.Title>
//               </Card.Body>
//             </Card>
//           )}
//         </Col>
//       </Row>
//     </Container></>
//   );
// }

// export default App;

import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import NavigationBar from './components/NavigationBar';
import HomePage from './pages/HomePage'; // Import your Home page component
import PokemonPage from './pages/PokemonPage'; // Import the Pokemon page
import LoginPage from './pages/LoginPage';
import FavoritesPage from './pages/FavoritesPage';

function App() {
  return (
    <Router>
      <NavigationBar />
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/pokemon" element={<PokemonPage />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/favorites" element={<FavoritesPage />} />
      </Routes>
    </Router>
  );
}

export default App;

