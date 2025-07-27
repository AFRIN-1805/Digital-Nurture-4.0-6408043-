// src/App.js
import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'Ajai M K R',
      status: 'Currently Employed',
      startDate: '2025-07-01',
      endDate: '2070-08-15'
    },
    {
      name: 'Afrin Banu A',
      status: 'Currently Employed',
      startDate: '2025-05-01',
      endDate: '2065-06-15'
    },
    {
      name: 'Jocelyn Mary Joyce L',
      status: 'Currently Employed',
      startDate: '2025-05-01',
      endDate: '2075-06-15'
    }

  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;