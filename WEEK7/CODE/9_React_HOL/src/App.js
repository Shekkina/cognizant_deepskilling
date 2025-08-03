import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const flag = false; // Change this to false to see IndianPlayers

  return (
    <div className="App">
      <h1>🏏 Cricket Application</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
