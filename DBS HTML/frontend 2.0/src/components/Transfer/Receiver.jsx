import axios from "axios";
import { React, useState, useEffect } from "react";

const Receiver = () => {
  const [bankdetails, setbankdetails] = useState([]);
  const [bicvalue, setbicvalue] = useState("");
  
  
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
      <h3>Receiver</h3>
      <div className="form-group w-75">
        <input
          type="search"
          name="bic"
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

        <label class="form-label" for="1">
          Receiver BIC
        </label>
      </div>
      <div className="form-group w-75">
        <input
          type="text"
          name="bankName"
          id="2"
          class="form-control"
          value={mymap[bicvalue]}
         
          disabled="true"
          

        />
        

        <label class="form-label" for="2">
          Bank Name
        </label>
      </div>
      <div className="form-group w-75">
        <input
          type="text"
          name="receiverName"
          id="3"
          class="form-control"
          onChange={e=>setreceiverdetails({...receiverdetails,[e.target.name]:e.target.value})}
          //disabled='false'
        />
        <label class="form-label" for="3">
          Receiver Name
        </label>
      </div>
      <div className="form-group w-75">
        <input
          type="text"
          name="accountnumber"
          id="4"
          class="form-control"
          onChange={e=>setreceiverdetails({...receiverdetails,[e.target.name]:e.target.value})}
          disabled={toggle}
        />
        <label class="form-label" for="4">
          Account Number
        </label>
      </div>
      <div className="form-group w-75">
        <input
          type="text"
          name="clearance"
          class="form-control"
          value="Approved"
          //onChange={e=>setreceiverdeatils({...receiverdeatils,[e.target.name]:[e.target.value]})}
          disabled="true"
        />
        
        <label class="form-label" for="5">
          Clearance
        </label>
      </div>
      {/* <button class="btn btn-primary btn-block btn-sm">Proceed</button> */}
    </div>
  );
};

export default Receiver;
