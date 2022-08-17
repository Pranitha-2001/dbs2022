import {React,useState} from "react";
import Receiver from "./Receiver";
import Amount from "./Amount";
import Sender from "./Sender";
import { useLocation, useNavigate } from "react-router-dom";

const Fundtransfer = ({ visible }) => {
 

  return (
    <div className="fluid-container" style={{ display: visible }}>
      <div className="row">
        
            <Sender />
            <Receiver/>
            <Amount/>
        
      </div>
      
    </div>
  );
};

export default Fundtransfer;
