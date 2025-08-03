import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = () => {
    if (!isNaN(rupees)) {
      const converted = parseFloat(rupees) / 90; // Example conversion rate
      setEuro(converted.toFixed(2));
    } else {
      alert("Enter a valid number");
    }
  };

  return (
    <div>
      <h2>Currency Convertor: ₹ to €</h2>
      <input
        type="text"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
        placeholder="Enter Rupees"
      />
      <button onClick={handleSubmit}>Convert</button>
      {euro && <p>Converted Amount: €{euro}</p>}
    </div>
  );
}

export default CurrencyConvertor;
