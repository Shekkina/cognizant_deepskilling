import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Rohit', score: 80 },
    { name: 'Virat', score: 95 },
    { name: 'Gill', score: 65 },
    { name: 'Rahul', score: 45 },
    { name: 'Hardik', score: 90 },
    { name: 'Jadeja', score: 50 },
    { name: 'Bumrah', score: 85 },
    { name: 'Shami', score: 60 },
    { name: 'Ashwin', score: 75 },
    { name: 'Pant', score: 55 },
    { name: 'Surya', score: 40 }
  ];

  const filtered = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players and Scores</h2>
      <ul>
        {players.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
      <h3>Players with Score Below 70</h3>
      <ul>
        {filtered.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
