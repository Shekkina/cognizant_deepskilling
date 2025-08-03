import React from 'react';

const IndianPlayers = () => {
  const T20players = ['Rohit', 'Virat', 'Gill', 'Hardik', 'Pant'];
  const RanjiPlayers = ['Shreyas', 'Sarfaraz', 'Unadkat', 'Kuldeep', 'Axar'];

  // Destructuring
  const [p1, p2, p3, p4, p5] = [...T20players];
  const [r1, r2, r3, r4, r5] = [...RanjiPlayers];

  // Merge
  const allPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players (T20)</h2>
      <ul>
        <li>{p1}</li>
        <li>{p3}</li>
        <li>{p5}</li>
      </ul>
      <h2>Even Team Players (Ranji Trophy)</h2>
      <ul>
        <li>{r2}</li>
        <li>{r4}</li>
      </ul>
      <h3>Merged List of All Players</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
