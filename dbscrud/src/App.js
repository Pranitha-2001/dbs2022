import logo from './logo.svg';
import './App.css';
import React from 'react';
import { Button } from 'primereact/button';
import { Routes, Route } from "react-router-dom";
import {AboutPage} from "./pages/AboutPage";
import {HomePage} from "./pages/HomePage";
import {CustPage} from "./pages/CustPage";
import {Navbar} from './Navbar'

function App() {
  return (
    <div className="App">
      <h3> DBS React Training</h3>
      <Navbar/>
      <Routes>
         <Route path="/" element={<HomePage/>}/>
         <Route path="/customer" element={<CustPage/>}/>
         <Route path="/about" element={<AboutPage/>}/>

      </Routes>
     
    </div>
  );
}

export default App;
