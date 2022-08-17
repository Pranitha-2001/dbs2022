import React, { useState } from "react"
// import cdata from "./customers"
import cdata from "./custlist.json"
import { Link } from "react-router-dom";

function CustHtmlTable() {
    const [customers, setCustomers] = useState(cdata)

    const getCustRowTags = () => {
        const rowTags = customers.map(c => {
            return (
                <tr key={c.id}>
                    <td>{c.id}</td>
                    <td>
                        <Link to={"/customers/" + c.id} className="mr-2">
                            {c.firstName} {c.lastName}
                        </Link>
                    </td>
                    <td>{c.email}</td>
                    <td>{c.phone}</td>
                    <td>
                        <Link to={"/customers/" + c.id + "/edit"} className="mr-2">Edit</Link>
                        <Link to={"/customers/" + c.id} >Delete</Link>
                    </td>
                </tr>
            )
        })
        return rowTags
    }

    return (
        <>
            <h3>Customers Table</h3>
            <table>
                <thead>
                <tr>
                    <th>Cust Id</th>
                    <th>Full Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                 { getCustRowTags()  }
                </tbody>
                
            </table>
        </>
    )
}

export default CustHtmlTable;