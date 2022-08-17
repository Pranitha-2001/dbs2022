import {React,useState,useEffect} from 'react'
import axios from 'axios'
const Sender = () => {
  //const [localcustdata,setlocalcustdata]=useState([])
  const [userState, setUserState] = useState({
    id: "",
    accountnumber: "",
    name: "",
    overdraft: "",
    balance: "",
    address:""
  });
  const [toggle, setToggle] = useState(false);
  const getData = async () => {
    const { data } = await axios.get(
      `http://localhost:8083/paymentapp/getcustomerdetails/${userState.id}`
    );
    setUserState({
      id: data.customerid,
      accountnumber: data.accountNumber,
      name: data.accountHolderName,
      overdraft: data.overDraft,
      balance: data.clearBalance,
      address:data.address
    });
  };
 
 localStorage.setItem('custdetails',JSON.stringify(userState))

  useEffect(() => {
    if (userState.id === "") {
      setToggle(false);
      setUserState({
        id: "",
        accountnumber: "",
        name: "",
        overdraft: "",
        balance: "",
        address:""
      });
    } else {
      setToggle(true);
    }
  }, [userState.id]);

  const handleChange = (event) => {
    setUserState({ ...userState, [event.target.name]: event.target.value });
  };

  const handleKeyPress = (event) => {
    if (event.key === "Enter") {
      getData();
    }
  };
  
    return (
        <div className="col-4">
          <center><h3>Sender</h3></center>
          <div className="form-group w-75">
          <label class="form-label" for="1">
              Id
            </label>
            <input
              type="text"
              name="id"
              id="1"
              required
              class="form-control"
              value={userState.id}
              onChange={handleChange}
              onKeyPress={handleKeyPress}
              
            />
           
          </div>
          <div className="form-group w-75">
          <label class="form-label" for="2">
              Account Number
            </label>
            <input
              type="text"
              name="accountno"
              
              id="2"
              class="form-control"
              value={userState.accountnumber}
              onChange={handleChange}
              disabled={toggle}
            />
           
          </div>
          <div className="form-group w-75">
          <label class="form-label" for="3">
              Name
            </label>
            <input
              type="text"
              name="name"
              id="3"
              class="form-control"
              value={userState.name}
              onChange={handleChange}
              disabled={toggle}
            />
           
          </div>
          <div className="form-group w-75">
          <label class="form-label" for="4">
              Overdraft
            </label>
            <input
              type="text"
              name="overdraft"
              id="4"
              class="form-control"
              value={userState.overdraft?'Yes':'No'}
              onChange={handleChange}
              disabled={toggle}
            />
            
          </div>
          <div className="form-group w-75">
          <label class="form-label" for="5">
              Current Balance
            </label>
            <input
              type="text"
              name="balance"
              class="form-control"
              value={userState.balance}
              onChange={handleChange}
              disabled={toggle}
            />
           
          </div>
          {/* <button class="btn btn-primary btn-block btn-sm">Proceed</button> */}
        </div>
    )
}

export default Sender
