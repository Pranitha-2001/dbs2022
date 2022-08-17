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
        <h3>Amount</h3>
        <div className="form-group w-75">
        <select class="form-select" aria-label="Default select example"
        name='transfercode'
        onChange={handleChange}>
            <option selected></option>
            <option value='banktransfer'>Bank Transfer</option>
            <option value='banktransfertoown'>Bank Transfer for Own Account</option>
            <option  value='customer'>Customer Transfer</option>
        </select>
          <label class="form-label" for="1">
            Transfer Type
          </label>
          
        </div>
        <div className="form-group w-75">
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
          <label class="form-label" for="2">
            Message Code
          </label>
        </div>
        <div className="form-group w-75">
          <input
            type="text"
            name="name"
            id="3"
            class="form-control"
            onChange={(e)=>{setamount(e.target.value)}}
            disabled=''
          />
          <label class="form-label" for="3">
            Amount
          </label>
        </div>
        <div className="form-group w-75">
          <input
            type="text"
            name="overdraft"
            id="4"
            class="form-control"
            value={amount*0.0025}
            onChange=''
            disabled='true'
          />
          <label class="form-label" for="4">
            Transfer fee
          </label>
        </div>
        <div className="form-group w-75">
          <input
            type="text"
            name="balance"
            class="form-control"
            value={amount-amount*0.0025}
            onChange=''
            disabled='true'
          />
          <label class="form-label" for="5">
            Credit Amount
          </label>
        </div>
      </div>
      
    )
}

export default Amount
