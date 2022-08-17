import React from "react";
import Receiver from "./Receiver";
import Amount from "./Amount";
import Sender from "./Sender";
import { useLocation, useNavigate } from "react-router-dom";

const Fundtransfer = ({ visible }) => {
 const navigate= useNavigate()

 const clickHandle=()=>{
  navigate('/validate')
 }

  return (
    <div className="fluid-container" style={{ display: visible }}>
      <div className="row">
        
            <Sender />
            <Receiver/>
            <Amount/>
        
      </div>
      <br />
      <br />
      <center>

      <button class="btn btn-success btn-block btn-md btn-end"
      onClick={clickHandle}
      >Transfer</button>
      </center>
    </div>
  );
};

export default Fundtransfer;
