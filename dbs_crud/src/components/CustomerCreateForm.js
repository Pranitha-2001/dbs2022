import axios from "axios"
import React, { useState } from "react"
import { useNavigate } from "react-router-dom"
import { InputText } from 'primereact/inputtext';

import { Button } from 'primereact/button';
import './FormDemo.css';

const CustomerCreateForm = (props) => {
    const [name, setName] = useState('')
    const [acctNo, setAcctNo] = useState('')
    const [email, setEmail] = useState('')
    const [phone, setPhone] = useState('')

    const [nameError, setNameError] = useState(null)
    const [acctNoError, setAcctNoError] = useState(null)
    const [emailError, setEmailError] = useState(null)
    const [phoneError, setPhoneError] = useState(null)

    const navigate = useNavigate()

    const validateCustomer = () => {
        let isValid = true
        if (name.length === 0) {
            setNameError("Name cannot be empty")
            isValid = false
        }
            
        if (acctNo.length === 0) {
            setAcctNoError("Acct No cannot be empty")
            isValid = false
        }
        if (email.length === 0) {
            setEmailError("Email cannot be empty")
            isValid = false
        }
        if (phone.length === 0) {
            setPhoneError("Phone cannot be empty")
            isValid = false
        }

        return isValid
    }

    const submitNewCustomer = (e) => {
        e.preventDefault()
        const customer = { name, acctNo, email, phone }
        const valid = validateCustomer()

        if (!valid) {
            return
        }
        axios.post("http://localhost:8080/customers", customer)
            .then(res => {
                alert("Customer created successfully")
                navigate("/customers/" + res.data.id)
            })
            .catch(err => {
                alert("Error submitting customer details")
            })
    }
    const handleNameChange = (e) => {
        setName(e.target.value)
        setNameError(null)
    }
    const handleEmailChange = (e) => {
        setEmail(e.target.value)
        setEmailError(null)
    }
    const handleAcctNoChange = (e) => {
        setAcctNo(e.target.value)
        setAcctNoError(null)
    }
    const handlePhoneChange = (e) => {
        setPhone(e.target.value)
        setPhoneError(null)

    }
    return (
        <div className="card mt-6">
            <form>
                <div className="field">
                    <label for="fname">First name:</label><br />
                    <InputText value={name} onChange={handleNameChange} placeholder="Enter Name" />
                    <span className="text-red-500">{nameError}</span>
                </div>

                <div className="field">
                    <label for="acctno">Acct No:</label><br />
                    <InputText value={acctNo} onChange={handleAcctNoChange} placeholder="Enter Acct No" />
                    <span  className="text-red-500">{acctNoError}</span>
                </div>

                <div className="field">
                    <label for="email">Email:</label><br />
                    <InputText value={email} onChange={handleEmailChange} placeholder="Enter Email" />
                    <span  className="text-red-500">{emailError}</span>
                </div>

                <div className="field">
                    <label for="phone">Phone:</label><br />
                    <InputText value={phone} onChange={handlePhoneChange} placeholder="Enter Phone" />
                    <span  className="text-red-500">{phoneError}</span>
                </div>

                <Button label="Small" icon="pi pi-check" 
                        className="p-button-sm" onClick={submitNewCustomer} 
                        />
            </form>
        </div>
    )

}

export default CustomerCreateForm