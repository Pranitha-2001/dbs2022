import { React, useEffect,useState } from "react";
import axios from "axios";
import { Link ,useNavigate} from "react-router-dom";
import './Loginstyle.css'




const Login = () => {
  const [empdata, setempdata] = useState([])
  const [name, setname] = useState('')
  const [password, setpassword] = useState('')
  const [empid,setempid]=useState('')
 
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
      navigate("/employee",{state:{userdata:empdata}})
    }
    else
    {
      loginstatus=false
      navigate("/failmessage")
    }
  }

  return (
    // <div className="row d-flex justify-content-center text-center">
     <div className="d-flex justify-content-center">
      <form>
        <div className="mb-3 ">
        <label htmlFor="exampleInputname1" className="flabel ml-5">
            Employee ID
          </label>
          <input
            type="text"
            className="fcontrol"
            id="empid"
            aria-describedby="nameHelp"
            required="true"
            onChange={(e)=>{setempid(e.target.value)}}
          />
          <div id="nameHelp" className="form-text">
           {
           empid==empdata.id?
           <div><p>Valid</p></div>:<div><p style={{color:"red"}}>Invalid Employee ID</p></div>
           }
          </div>


          

          <label htmlFor="exampleInputname1" className="flabel"
          style={{display:empid==empdata.id ? 'block' : 'none'} }>
            Username
          </label>
          <input
            type="text"
            className="fcontrol"
            id="exampleInputname1"
            aria-describedby="nameHelp"
            style={{display:empid==empdata.id ? 'block' : 'none'} }
            onChange={(e)=>{setname(e.target.value)}}
          />
        </div>

        <div className="mb-3">
          <label for="exampleInputPassword1" className="flabel"
          style={{display:empid==empdata.id ? 'block' : 'none'} }>
            Password
          </label>
          <input
            type="password"
            className="fcontrol"
            id="exampleInputPassword1"
            onChange={(e)=>{setpassword(e.target.value)}}
            style={{display:empid==empdata.id ? 'block' : 'none'} }
          />
        </div>

        <button  className="btn btn-success"
        style={{display:empid==empdata.id ? 'block' : 'none'} }
        onClick={validate}>
          Login
        </button>
       

      </form>
    </div>
  );
};

export default Login;
