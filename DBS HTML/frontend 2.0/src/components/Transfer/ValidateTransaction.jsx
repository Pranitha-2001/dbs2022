import axios from 'axios'
import {React,useEffect,useState} from 'react'
import {useNavigate} from 'react-router-dom'



const ValidateTransaction = () => {
    const [custdetails, setcustdetails] = useState('')
    const [bicandbank,setbicandbank]=useState('')
    const [receiverdata,setreceiverdata]=useState('')
    const [amountdetails,setamountdetails]=useState('')
    const [status, setstatus] = useState('')
    const navigate=useNavigate()
    const [transaction,settransaction]=useState(
        {
            "transactionId": 0,
            "customerId": {
              "customerid": "string",
              "accountNumber": "string",
              "accountHolderName": "string",
              "overDraft": 0,
              "clearBalance": 0,
              "address": {
                "addressId": 0,
                "city": "string",
                "zipcode": "string"
              }
            },
            
            "receiverbic": {
              "bic": "string",
              "bankName": "string"
            },
            "receiverAccountNumber": "string",
            "receiverName": "string",
            "transferType": {
              "transfercode": "string",
              "transferdescription": "NA"
            },
            "messageCode": {
              "messageCode": "string",
              "instruction": "NA"
            },
            "currencyAmount": 0,
            "transferFee": 0,
            "inrAmount": 0,
            "transferDate": Date().slice(0,24)
          }
          
    )
    const custdata=JSON.parse(localStorage.getItem('custdetails'))
    const bic_bank=JSON.parse(localStorage.getItem('bicandbankname'))
    const receiver_data=JSON.parse(localStorage.getItem('receiverdata'))
    const amount_details=JSON.parse(localStorage.getItem('amount'))   
    
    const addtransaction=()=>{
        axios.post('http://localhost:8083/paymentapp/addtransaction',transaction).then((res)=>{
            console.log(res.data.message);
            setstatus(res.data.message)
        }).catch((err)=>{
          console.log(err.response.data.message)
          setstatus(err.response.data.message)
        })
    }
      
        useEffect(()=>{
        setcustdetails(custdata)
        setbicandbank(bic_bank)
        setreceiverdata(receiver_data)
        setamountdetails(amount_details)
        settransaction({
            "transactionId": Math.floor(Math.random() * (1000 - 2) + 2),
            "customerId": {
              "customerid": custdata.id,
              "accountNumber": custdata.accountnumber,
              "accountHolderName": custdata.name,
              "overDraft": custdata.overdraft,
              "clearBalance": custdata.balance,
              "customerType":custdata.customerType,
              "address": {
                "addressId": custdata.address.addressId,
                "city":  custdata.address.city,
                "zipcode":  custdata.address.zipcode
              }
            },
            "receiverbic": {
              "bic": bic_bank.bic,
              "bankName": bic_bank.bankName
            },
            "receiverAccountNumber": receiver_data.accountnumber,
            "receiverName": receiver_data.receiverName,
            "transferType": {
              "transfercode": amount_details.transfertype,
              "transferdescription": "NA"
            },
            "messageCode": {
              "messageCode": amount_details.messagecode,
              "instruction": "NA"
            },
            "currencyAmount": amount_details.amt,
            "transferFee": amount_details.t_fee,
            "inrAmount": amount_details.total,
            "transferDate": Date().slice(0,24)
          }
        )
      },[])

      function handleSubmit(e) {
        e.preventDefault();
        console.log('You Posted.');
        addtransaction()


      }
    

    
        
    return (
        <div>
          <center>

            <form onSubmit={handleSubmit}>
            
            <button type="submit" value="Post" className="btn btn-lg btn-primary"
            
            >Confirm Transaction</button>
              
            </form>
            <br />
            <br />
            {status=="valid"? <p style={{color:"green"}}>Transaction Successfull !</p>:<p style={{color:"red"}}>{status}</p>}

            {/* <button onClick={navigate('/employee')} className='btn btn-info btn-lg'>Take Me to Employee Dashboard</button> */}
            
            
           
          </center>
        </div>
    )
}

export default ValidateTransaction
