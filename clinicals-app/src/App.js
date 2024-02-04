import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import AddPatient from './components/AddPatient';
import AddClinicals from './components/AddClinical';
import Home from './components/Home';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route path="/addPatient" element={<AddPatient />} />
          <Route path="/addClinicals/:patientId" element={<AddClinicals />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}


export default App;
