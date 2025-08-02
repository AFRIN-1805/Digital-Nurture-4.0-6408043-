import React from 'react';

function App() {
  // Heading using React.createElement
  const heading = React.createElement('h1', null, 'Office Space Rental');

  // Image using JSX
  const image = (
    <img
      src="https://via.placeholder.com/400x200.png?text=Office+Space"
      alt="Office Space"
      style={{ width: '400px', height: '200px', marginBottom: '20px' }}
    />
  );

  // Single office object
  const office = {
    name: 'Tech Hub',
    rent: 55000,
    address: '123 Innovation Street, Chennai'
  };

  // List of office spaces
  const officeList = [
    { name: 'Startup Studio', rent: 45000, address: '45 MG Road, Bengaluru' },
    { name: 'Corporate Tower', rent: 75000, address: '88 Anna Salai, Chennai' },
    { name: 'Creative Loft', rent: 60000, address: '12 Residency Road, Mumbai' },
    { name: 'Enterprise Plaza', rent: 85000, address: '101 Cyber City, Gurugram' }
  ];

  // Function to style rent
  const getRentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {heading}
      {image}

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Address:</strong> {office.address}</p>
      <p><strong>Rent:</strong> <span style={getRentStyle(office.rent)}>₹{office.rent}</span></p>

      <h2>Available Office Spaces</h2>
      <ul>
        {officeList.map((item, index) => (
          <li key={index} style={{ marginBottom: '10px' }}>
            <p><strong>Name:</strong> {item.name}</p>
            <p><strong>Address:</strong> {item.address}</p>
            <p><strong>Rent:</strong> <span style={getRentStyle(item.rent)}>₹{item.rent}</span></p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;