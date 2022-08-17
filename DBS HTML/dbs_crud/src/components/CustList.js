import React, { useState, useEffect } from 'react';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import cdata from "./custlist.json"
import { Link } from "react-router-dom";

const CustList = () => {
    const [customers, setCustomers] = useState(cdata)

    const detailsTemplate = (rowData) => {
        return <Link to={"/customers/" + rowData.id}>Show</Link>
    }

    return (
        <div>
            <div className="card">
                <DataTable value={customers} responsiveLayout="scroll">
                    <Column field="id" header="Id"></Column>
                    <Column field="firstName" header="First Name"></Column>
                    <Column field="lastName" header="Last Name"></Column>
                    <Column field="email" header="Email Addr."></Column>
                    <Column field="phone" header="Phone No."></Column>
                    <Column header="Actions" body={detailsTemplate}></Column>
                </DataTable>
            </div>
        </div>
    );
}

export default CustList;