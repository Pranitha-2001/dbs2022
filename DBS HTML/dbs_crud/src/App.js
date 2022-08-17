import './App.css';
import CustomersPage from './pages/CustomersPage';
import AboutPage from './pages/AboutPage';
import HomePage from './pages/HomePage';
import { Routes, Route } from "react-router-dom";
import { Link } from "react-router-dom"
import CustDetails from './components/CustDetails';
import CustTableBackend from './components/CustTableBackend';
import CustomerCreateForm from "./components/CustomerCreateForm"

function App() {

  return (
    <div className="App">
        <nav>
            <Link to="/" className='navLink'>Home</Link>
            <Link to="/customers" className='navLink'>Customers</Link>
            <Link to="/backend" className='navLink'>Backend Data</Link>
            <Link to="/about" className='navLink'>About</Link>
        </nav>      
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/customers" element={<CustomersPage />} />
          <Route path="/backend" element={<CustTableBackend />} />
          <Route path="/customers/:custid" element={<CustDetails />} />
          <Route path="/about" element={<AboutPage />} />
          <Route path="/customers/new" element={<CustomerCreateForm />} />
      </Routes>
    </div>
  );
}

export default App;
