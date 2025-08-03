import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  // Element variable to render based on login
  let content;
  if (isLoggedIn) {
    content = <UserPage />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>🛫 Ticket Booking Application</h1>
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}
      <hr />
      {content}
    </div>
  );
}

export default App;
