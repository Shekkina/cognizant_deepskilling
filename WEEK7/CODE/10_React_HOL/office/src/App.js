import React from 'react';

function App() {
  // Office object
  const office = {
    name: "TechSquare Workspace",
    rent: 55000,
    address: "3rd Floor, Ring Road, Bangalore"
  };

  // Office list
  const officeList = [
    { name: "UrbanCo Workhub", rent: 45000, address: "Koramangala, Bangalore" },
    { name: "Regus Infinity", rent: 62000, address: "Whitefield, Bangalore" },
    { name: "WeWork Galaxy", rent: 80000, address: "MG Road, Bangalore" }
  ];

  const getRentColor = (rent) => {
    return {
      color: rent < 60000 ? 'red' : 'green',
      fontWeight: 'bold'
    };
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>🏢 Office Space Rental App</h1>

      <img
        src="https://images.unsplash.com/photo-1582407947304-fd86f028f716"
        alt="Office"
        width="400"
        style={{ borderRadius: '10px', marginBottom: '20px' }}
      />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Address:</strong> {office.address}</p>
      <p><strong>Rent:</strong> <span style={getRentColor(office.rent)}>{office.rent}</span></p>

      <hr />

      <h2>Available Offices</h2>
      <ul>
        {officeList.map((off, index) => (
          <li key={index} style={{ marginBottom: '15px' }}>
            <p><strong>Name:</strong> {off.name}</p>
            <p><strong>Address:</strong> {off.address}</p>
            <p>
              <strong>Rent:</strong>{' '}
              <span style={getRentColor(off.rent)}>{off.rent}</span>
            </p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
