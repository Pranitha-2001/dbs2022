import axios from "axios"
import { useState, useEffect } from "react"


import React from "react"
 

export function CustTable() {
    const [customers, setCustomers] = useState([])
    const [page, setPage] = useState(0)

 

    useEffect(() => {
        axios.get("http://localhost:8083/getcustomerdetails" )
            .then(res => {
                setCustomers(res.data)
            }).catch(err => {
                console.log("Error occured")
            })
    }, [])

 

    const getRowTags = () => {
        const rowTags = customers.map(c => {
            return <tr>
                <td>{c.customerId}</td>
                
                <td>{c.accountHolderName}</td>
                
                <td>{c.clearBalance}</td>
            </tr>
        })

 

        return rowTags
    }

 

    return (
        <div>
            <table>
                <tr>
                    <th>Account Number</th>
                    <th>Name</th>
                    <th>Account Holder No</th>
                    <th>Address</th>
                    <th>clearBalance</th>
                </tr>
                { getRowTags() }
            </table>
        </div>
    )
}