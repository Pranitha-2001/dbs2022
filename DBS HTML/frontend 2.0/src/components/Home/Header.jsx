import React from "react";
import { Link, Outlet } from "react-router-dom";
import dbslogo from "./dbslogo.jpg"
const Header = () => {
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-light bg-blue">
        <div className="container-fluid">
          <a className="navbar-brand fs-3" href="/">
            DBS Bank
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
          <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <a className="nav-link active fs-6" aria-current="page" href="/">
                  Home
                </a>
              </li>
              {/* style={{display:==empdata.id ? 'block' : 'none'} } */}
              <div >
              <li className="nav-item">
               
                <Link to="/login" className="nav-link fs-6" id="login"
                onClick={()=>document.getElementById('login').style.display="none"}>
                  Login
                </Link>
              </li>
              </div>
              <li className="nav-item fs-6 ">
                <Link to="/about" className="nav-link">
                  About
                </Link>
              </li>

              
            </ul>

            
              <img
                src={dbslogo}
                alt="image"
                className="img-fluid rounded"
                width="150"
              />
              
            
          </div>
        </div>
      </nav>
      
      <Outlet />
    </div>
  );
};

export default Header;
