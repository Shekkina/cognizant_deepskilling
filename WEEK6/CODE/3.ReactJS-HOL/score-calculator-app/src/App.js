import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculatorScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Shekkina Paulin" school="ABC High School" total={450} goal={5} />
    </div>
  );
}

export default App;
