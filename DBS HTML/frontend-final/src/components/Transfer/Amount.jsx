import axios from 'axios'
import {React,useState,useEffect} from 'react'

const Amount = () => {
    const toggle=false
    const [amount, setamount] = useState(0)
    const [tranfertype,settransfertype]=useState()
    const [messagcode, setmessagcode] = useState()

    const handleChange=(e) =>{
      let {value} = e.target;
      settransfertype(value);
      }
      const handleChange2=(e) =>{
        let {value} = e.target;
        setmessagcode(value
        );
        }
    localStorage.setItem('amount',JSON.stringify({
      'transfertype':tranfertype,
      'messagecode':messagcode,
      'amt':amount,
      't_fee':Math.ceil(amount*0.005),
      'total':amount-Math.ceil(amount*0.005)
    }))
    return (
        <div className="col-4">
        <center><h3>Amount</h3></center>
        <div className="form-group w-75">
        <label class="form-label" for="1">
            Transfer Type
          </label>
        <select class="form-select" aria-label="Default select example"
        name='transfercode'
        onChange={handleChange}>
            <option selected></option>
            <option value='banktransfer'>Bank Transfer</option>
            <option value='banktransfertoown'>Bank Transfer for Own Account</option>
            <option  value='customer'>Customer Transfer</option>
        </select>
         
          
        </div>
        <div className="form-group w-75">
        <label class="form-label" for="2">
            Message Code
          </label>
        <select class="form-select" aria-label="Default select example"
        name='messagecode'
        onChange={handleChange2}
        >
            <option selected></option>
            <option value='CHQB'>CHQB</option>
            <option value='HOLD'>HOLD</option>
            <option value='CORT'>CORT</option>
            <option value='INTC'>INTC</option>
            <option  value='PHOB'>PHOB</option>
            <option value='PHON'>PHON</option>
            <option value='REPA'>REPA</option>
            <option value='SDVA'>SDVA</option>
            <option value='Other'>Other</option>

            
        </select>
         
        </div>
        <div className="form-group w-75">
        <label class="form-label" for="3">
            Amount
          </label>
          <input
            type="text"
            name="name"
            required
            id="3"
            class="form-control"
            onChange={(e)=>{setamount(e.target.value)}}
            disabled=''
          />
         
        </div>
        <div className="form-group w-75">
        <label class="form-label" for="4">
            Transfer fee
          </label>
          <input
            type="text"
            name="overdraft"
            id="4"
            class="form-control"
            value={amount*0.25}
            onChange=''
            disabled='true'
          />
         
        </div>
        <div className="form-group w-75">
        <label class="form-label" for="5">
            Credit Amount
          </label>
          <input
            type="text"
            name="balance"
            class="form-control"
            value={parseInt(amount)+amount*0.25}
            onChange=''
            disabled='true'
          />
         
        </div>
      </div>
      
    )
}

export default Amount
