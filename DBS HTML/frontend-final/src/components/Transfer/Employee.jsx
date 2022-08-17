import { React, useState, useEffect } from "react";
import { Outlet, useLocation, useNavigate } from "react-router-dom";
import Fundtransfer from "./Fundtransfer";
const Employee = () => {
  const navigate = useNavigate();
  const logHandler = () => {
    navigate("/logger");
  };

  const [dis,setdis]=useState("none")
  
  const clickHandle=()=>{
    
    setdis("block")
  }

  const custHandle=()=>{
    navigate('/customerdetails')
  }



  return (
    <div
      className="row"
      style={{ margin: "1rem 2rem", display: "flex", gap: "3rem" }}
    >
      
      <div className="d-flex col-6 justify-content-between">
        <button
          type="button"
          class="btn btn-outline-primary"
          onClick={logHandler}
        >
          Loggers
        </button>
        <button type="button" class="btn btn-outline-success"
        onClick={clickHandle}>
          Transfer Funds
        </button>
        <button type="button" class="btn btn-outline-dark"
        onClick={custHandle}>
          Customers
        </button>
        <button type="button" class="btn btn-outline-info"
        disabled>
         Analytics
        </button>
      </div>
      <Fundtransfer visible={dis}/>


      
          </div>
  );
};
export default Employee;
