import React from "react"

import { Panel } from 'primereact/panel';
import { Button } from 'primereact/button';

const CustView = (props) => {
    const customer = props.customer
    const deleteFn = props.deleteCustomer

    return (
        <> 
            <div className="w-6">
                <h3>
                    Customer Details Page - {customer.id}
                </h3>
                <Panel header={customer.name}>
                    <p>Account : {customer.acctNo}</p>
                    <p>Email : {customer.email}</p>
                    <p>Phone : {customer.phone}</p>
                    <Button className="p-button-danger" onClick={() => deleteFn(customer.id)}>
                        Delete
                    </Button>
                </Panel>

            </div>
        </>
    )
}

export default CustView;
