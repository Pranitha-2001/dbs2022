import axios from 'axios'
import React,{useEffect, useState} from 'react'

const Logger = () => {
    const [logdata, setlogdata] = useState([])
    const URL=`http://localhost:8083/paymentapp/gettransactions`
    const getlog=async()=>{
        const {data}=await axios.get(URL)
        setlogdata(data)
        console.log(logdata);
    }
    useEffect(()=>{
    getlog()
    },[])
    const status=localStorage.getItem('transstatus')

    const getRowTags = () => {
      
      const rowTags = logdata.map(c => {
          return(
            <tbody>
  
          <tr className="table table-light">
                <td>{c.transactionId}</td>
              <td >{c.transferDate}</td>
              <td>{c.currencyAmount}</td>
              <td>{c.customerId.accountHolderName}</td>
              <td>{c.receiverName}</td>
              <td>{c.receiverAccountNumber}</td>
              <td>{c.receiverbic.bic}</td>
              <td>{c.receiverbic.bankName}</td>
              <td>{c.transferType.transfercode}</td>
              <td>{c.messageCode.messageCode}</td>
              <td >{status=='valid'?<p style={{color:'green'}}>Success</p>:<p style={{color:'red'}}>Failed</p>}</td>
              
            
              
          </tr>
            </tbody>
      )})
  
      return rowTags
  }
  
    return (
      <div>
                
   <table class="table table-hover">
  <thead>

    <tr className="table table-dark">
      <th>Transation Id</th>
      <th>Date</th>
      <th>Amount</th>
      <th>Sender Name</th>
      <th>Receiver Name</th>
      <th> Receiver Account No.</th>
      <th>Receiver BIC</th>
      <th>Receiver Bank</th>
      <th>Transfer Type</th>
      <th>Message Code</th>
      <th>Status</th> 
    </tr>
  
  </thead>
     
    {getRowTags()}
  
</table>




      </div>
    )}

export default Logger
