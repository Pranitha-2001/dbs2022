import axios from "axios";
import { React, useState, useEffect } from "react";
import {useNavigate} from 'react-router-dom'

const Receiver = () => {
  const [bankdetails, setbankdetails] = useState([]);
  const [bicvalue, setbicvalue] = useState("");
  const [receiverName,setreceiverName]=useState("");
  const [validreceiver,setvalidreceiver]=useState("");
  

  const navigate= useNavigate()
 const clickHandle=()=>{
  navigate('/validate')
 }


  const validatereceiver=()=>{
    console.log(receiverName);
    axios.post(`http://localhost:8083/paymentapp/validatereceiver`,receiverName).then(res=>
    {
    console.log(res.data)
    setvalidreceiver(res.data)
    }
    ).catch(err=>console.log(err))
  }



  
  const getbankdetails = () => {
    axios
      .get("http://localhost:8083/paymentapp/getbankdetails")
      .then((res) => {
        setbankdetails(res.data);
      })
      .catch((e) => console.log(e));
  };
  useEffect(() => {
    getbankdetails();
    
  },[]);

  const mymap = {};
  const myarray = [];
  for (let x of bankdetails) {
    mymap[x.bic] = x.bankName;
    myarray.push(x.bic);
  }
  const [filteredbic, setFilteredbic] = useState(myarray);

  
  useEffect(() => {
    setFilteredbic(
      filteredbic.filter((b_ic) => {
        
        return b_ic
          .startsWith(bicvalue.substring(0, bicvalue.length).toUpperCase());
      })
    );
  }, []);

  useEffect(()=>{
    validatereceiver()
  },[receiverName])



  const [receiverdetails, setreceiverdetails] = useState({
    'receiverName':'',
    'accountnumber':'',
    'clearance':'Approved'
  })
localStorage.setItem('bicandbankname',JSON.stringify({'bic':bicvalue,
'bankName':mymap[bicvalue]}))

localStorage.setItem('receiverdata',JSON.stringify(receiverdetails))
//console.log(receiverdetails);
  const toggle = false;
  return (
    <div className="col-4">
      <center><h3>Receiver</h3></center>
      <div className="form-group w-75">
      <label class="form-label" for="1">
          Receiver BIC
        </label>
        <input
          type="search"
          name="bic"
          required
          class="form-control"
          placeholder="Search by BIC"
          aria-label="Search"
          aria-describedby="search-addon"
          list='list'
          onChange={(e) => {
            setbicvalue(e.target.value)
            
          }}
          value={bicvalue}
        />
        <datalist id="list">
          {myarray.map((bic) => {
            return <option value={bic} />;
          })}
        </datalist>

        
      </div>
      <div className="form-group w-75">
      <label class="form-label" for="2">
          Bank Name
        </label>
        <input
          type="text"
          name="bankName"
          id="2"
          class="form-control"
          value={mymap[bicvalue]}
         
          disabled="true"
          

        />
        

       
      </div>
      <div className="form-group w-75">
      <label class="form-label" for="3">
          Receiver Name
        </label>
        <input
          type="text"
          required
          name="receiverName"
          id="3"
          class="form-control"
          onChange={e=>{
            setreceiverdetails({...receiverdetails,[e.target.name]:e.target.value})
            setreceiverName(e.target.value)
            }}
          //disabled='false'
          
        />
        
        <label style={{color:'red'}} class="form-label" for="5">
          {validreceiver=='found'?'Receiver blocked by SDN policy':''}
        </label>
        
      </div>
      <div className="form-group w-75">
      <label class="form-label" for="4">
          Account Number
        </label>
        <input
          type="text"
          required
          name="accountnumber"
          id="4"
          class="form-control"
          onChange={(e)=>{setreceiverdetails({...receiverdetails,[e.target.name]:e.target.value})
        }}
          disabled={toggle}
        />
        
      </div>
      <div className="form-group w-75">
      <label class="form-label" for="5">
          Clearance
        </label>
        <input
          type="text"
          name="clearance"
          class="form-control"
          value= {validreceiver=='found'?'Rejected':'Approved'}
          //onChange={e=>setreceiverdeatils({...receiverdeatils,[e.target.name]:[e.target.value]})}
          disabled="true"
        />
       
        
        
        
      </div>
      {/* <button class="btn btn-primary btn-block btn-sm">Proceed</button> */}
      <br />
      <br />
      <center>

      <button class="btn btn-success btn-block btn-md btn-end"
      onClick={clickHandle}
      
      disabled={validreceiver=='found'?true:false}
      >Transfer</button>
      </center>
    </div>
  );
};

export default Receiver;
