import axios from 'axios'
import {React,useEffect,useState} from 'react'

const Customerdetails = () => {
  const [custdetails, setcustdetails] = useState([])

  const getcustomerdetailstodisplay=async()=>{
   const {data}= await axios.get('http://localhost:8083/paymentapp/getcustomerdetails')
      setcustdetails(data)
      console.log(data);
  }
  
  useEffect(()=>{
    getcustomerdetailstodisplay()
  },[])

  const getRowTags = () => {
    console.log('called');
    const rowTags = custdetails.map(c => {
        return(
          <tbody>

        <tr className="table table-light">
            <td>{c.customerid}</td>
            <td>{c.accountHolderName}</td>
            <td>{c.accountNumber}</td>
            <td>{c.clearBalance}</td>
            <td>{c.customerType}</td>
            <td>{c.overDraft}</td>
            <td>{c.address.city+','+c.address.zipcode}</td>
          
            
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
      <th>customerId</th>
      <th>Name</th>
      <th>Account Number</th>
      <th>Current Balance</th>
      <th>Customer Type</th>
      <th>Overdraft</th>
      <th>Address</th> 
    </tr>
  
  </thead>
     
    {getRowTags()}
  
</table>
</div>


            
       
    )}

export default Customerdetails
