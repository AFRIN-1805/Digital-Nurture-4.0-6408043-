import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculatorScore';

function App() {
  return (
    <div>
      <CalculateScore Name={"Ajai"}
      School={"Chennai Public School"}
      total={500}
      goal={600}
      />
    </div>
  );
}

export default App;
