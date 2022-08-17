import logo from './logo.svg';
import './App.css';
import React from 'react';
import {Routes,Route } from "react-router-dom";
import {Customer} from "./Components/Customer";
import {logger} from "./Components/logger";
import {Transferfunds} from "./Components/Transferfunds";
import {Navabar} from './Navbar'
function App() {
  return (
    <div className="App">
      <Navbar/>
      <Routes>
         <Route path="/Customer" element ={<Customer/>}/>
         <Route path="/logger" element ={<logger/>}/>
         <Route path="/Transferfunds" element ={<Transferfunds/>}/>
         
      </Routes>
    </div>
  );
}

export default App;
