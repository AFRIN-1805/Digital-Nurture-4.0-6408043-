import React from 'react';
import ListofPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = true; // Change to false to toggle view

  return (
    <div className="App">
      <h1>🏏 Welcome to CricketApp</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;