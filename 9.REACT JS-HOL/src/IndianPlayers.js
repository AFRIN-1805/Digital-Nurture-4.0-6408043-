import React from 'react';

const IndianPlayers = () => {
  const T20players = ['Virat', 'Rohit', 'Hardik', 'Pant', 'Surya'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Shreyas', 'Iyer', 'Sarfaraz'];

  // Merge arrays
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  // Destructure into odd/even teams
  const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h2>🏏 Odd Team Players</h2>
      <ul>{oddTeam.map((player, i) => <li key={i}>{player}</li>)}</ul>

      <h2>🏏 Even Team Players</h2>
      <ul>{evenTeam.map((player, i) => <li key={i}>{player}</li>)}</ul>
    </div>
  );
};

export default IndianPlayers;