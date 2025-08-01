import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 85 },
    { name: 'Rohit Sharma', score: 45 },
    { name: 'Shubman Gill', score: 78 },
    { name: 'KL Rahul', score: 65 },
    { name: 'Hardik Pandya', score: 90 },
    { name: 'Ravindra Jadeja', score: 55 },
    { name: 'Jasprit Bumrah', score: 88 },
    { name: 'Mohammed Shami', score: 60 },
    { name: 'Rishabh Pant', score: 72 },
    { name: 'Suryakumar Yadav', score: 40 },
    { name: 'Yuzvendra Chahal', score: 68 }
  ];

  const filteredPlayers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>🏏 Players with Score ≥ 70</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;