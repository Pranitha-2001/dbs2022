
import { React, useEffect,useState } from "react";
import axios from "axios";
import { Link ,useNavigate} from "react-router-dom";
import dbslogo from "./dbs-logo.png"
import "./Loggin.css"
const Loggin = () => {
    const [empdata, setempdata] = useState([])
  const [name, setname] = useState('')
  const [password, setpassword] = useState('')
  const [empid,setempid]=useState('')
  const d=new Date();
  const datemap={
    1:'Monday',
    2:'Tuesday',
    3:'Wednesday',
    4:'Thursday',
    5:'Friday',
    6:'Saturday',
    7:'Sunday'
  }
 
  const navigate=useNavigate()
  const URL = `http://localhost:8083/paymentapp/getemployeebyid/${empid}`;

  const getcred = async () => {
    const {data} = await axios.get(URL);
    setempdata(data)
    //console.log(data);
    
  } 

  useEffect(()=>{
    getcred();
  } , [empid])

  var loginstatus=false
  
  const validate=(e)=>{
    e.preventDefault()
    if(name===empdata.employeeName && password===empdata.password)
    {
      loginstatus=true
      if(d.getDay()==6|| d.getDay()==7)
      {
         navigate("/weekend")
      }
      else
      {
        navigate("/employee",{state:{userdata:empdata}})
      }
      
    }
    else
    {
      loginstatus=false
      navigate("/failmessage")
    }
  }


    return (
        <div>

<section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-around align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5 left">
        <img src={dbslogo} />
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1 right">
        <form>
          
        <div class="form-outline mb-4">
          <label class="form-label" for="form3Example3">Employee ID</label>
            <input type="email" id="form3Example3" class="form-control form-control-lg"
              
              onChange={(e)=>{setempid(e.target.value)}}
              />
              {
           empid==empdata.id?
           <div><p>Valid</p></div>:<div><p style={{color:"red"}}>Invalid Employee ID</p></div>
           }
            
          </div>
          
          <div class="form-outline mb-4">
          <label class="form-label" for="form3Example3">Username</label>
            <input type="email" id="form3Example3" class="form-control form-control-lg"
               
              onChange={(e)=>{setname(e.target.value)}}/>
           
          </div>

          
          <div class="form-outline mb-3">
          <label class="form-label" for="form3Example4">Password</label>
            <input type="password" id="form3Example4" class="form-control form-control-lg"
              
              onChange={(e)=>{setpassword(e.target.value)}}/>
           
          </div>

         

          <div class="text-center text-lg-start mt-4 pt-2">
            <button type="button" class="btn btn-danger btn-lg"
               onClick={validate}
              style={{paddingLeft:'2.5rem',paddingRight: '2.5rem'}}>Login</button>
            
          </div>

        </form>
      </div>
    </div>
  </div>
  {/* <div
    class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
    
    <div class="text-white mb-3 mb-md-0">
      Copyright © 2020. All rights reserved.
    </div>
   
    <div>
      <a href="#!" class="text-white me-4">
        <i class="fab fa-facebook-f"></i>
      </a>
      
    </div>
    
  </div> */}
</section>
            
        </div>
    )
}

export default Loggin
