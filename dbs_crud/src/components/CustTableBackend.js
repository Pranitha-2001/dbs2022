import axios from "axios";
import React, { useEffect, useState } from "react"
import { Link } from "react-router-dom";
import CustView from './CustView';

function CustTableBackend() {
    const [customers, setCustomers] = useState(null)
    const [selectedCustomer, setSelectedCustomer] = useState(null)

    useEffect(() => {
        axios.get("http://localhost:8080/customers")
            .then(res => setCustomers(res.data))
            .catch(err => alert("Could not fetch customers"))
    }, [])

    const handleClick = (e, c) => {
        e.preventDefault()
        setSelectedCustomer(c)
    }

    const handleDeleteCustomer = (id) => {
        alert("Trying to delete : " + id)
    }

    const getCustRowTags = () => {
        const rowTags = customers.map(c => {
            return (
                <tr key={c.id}>
                    <td>{c.id}</td>
                    <td>
                        <Link className="mr-2" to={"/customers/" + c.id}>
                            {c.name}
                        </Link>
                    </td>
                    <td>{c.acctNo}</td>
                    <td>{c.email}</td>
                    <td>{c.phone}</td>
                    <td>
                        <Link to={"/customers/" + c.id + "/edit"} className="mr-2">Edit</Link>
                        <Link to={"/customers/" + c.id} >Delete</Link>
                    </td>
                    <td>
                        <a href="" onClick={(e) => handleClick(e, c)}>Show down</a>
                    </td>
                </tr>
            )
        })
        return rowTags
    }

    const getHeaderRow = () => {
        return (
                <tr>
                    <th>Cust Id</th>
                    <th>Name</th>
                    <th>Acct No</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Actions</th>
                    <th>Show Details</th>
                </tr>
        )
    }

    return (
        <>
            <h3>Customers Table</h3>
            <Link to="/customers/new">Create New Customer</Link>
            { customers && <table>
                    <thead>{ getHeaderRow() }</thead>
                    <tbody>{ getCustRowTags()  }</tbody>
                    
                </table>
            }
            { selectedCustomer && <CustView customer={selectedCustomer} deleteCustomer={handleDeleteCustomer} /> }
        </>
    )
}

export default CustTableBackend;