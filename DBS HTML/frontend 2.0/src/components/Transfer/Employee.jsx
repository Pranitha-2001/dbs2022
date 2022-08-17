import { React, useState, useEffect } from "react";
import { Outlet, useLocation, useNavigate } from "react-router-dom";
import Fundtransfer from "./Fundtransfer";
const Employee = () => {
  const location = useLocation();
  const navigate = useNavigate();
  const logHandler = () => {
    navigate("/logger");
  };
  const [name, setName] = useState("");
  const [dis,setdis]=useState("none")
  
  const clickHandle=()=>{
    
    setdis("block")
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
        onCli>
          Customers
        </button>
        <button type="button" class="btn btn-outline-info">
         Analytics
        </button>
      </div>
      <Fundtransfer visible={dis}/>


      
          </div>
  );
};
export default Employee;
