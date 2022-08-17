import axios from "axios";
import React, { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom";
import { Link } from "react-router-dom";
import { Panel } from 'primereact/panel';
import { Button } from 'primereact/button';
import { ProgressSpinner } from 'primereact/progressspinner';

const CustDetails = () => {
    let [customer, setCustomer] = useState(null)
    let [loading, setLoading] = useState(true)
    let [errors, setErrors] = useState(null)
    const navigate = useNavigate()

    // call spring boot backend to get cust details with id
    // we need the customer id
    let params = useParams();

    useEffect(() => {
        setTimeout(() => {
            axios.get("http://localhost:8080/customers/" + params.custid)
            .then(res => {
                setCustomer(res.data)
                setLoading(false)
            })
            .catch(err => {
                setErrors("Couldnt fetch customer details : " + params.custid)
                setLoading(false)
            })
        }, 500)
        
    }, [params])

    const deleteCustomer = () => {
        const id = params.custid
        axios.delete("http://localhost:8080/customers/" + id)
            .then(res => {
                alert("Deletion successful")
                navigate("/backend")
            }).catch(err => {
                alert("Error in deletion")
            })
    }

    const getLoadingTag = () => {
        return <div>
            <h3>Loading Customers ...</h3>
            <ProgressSpinner />
        </div>
    }

    return (
        <>
            <div className='mt-5'>
                <Link to="/backend"> ---Back to Customers </Link>
            </div>
           
            <div className="w-6">
                <h3>
                    Customer Details Page - {params.custid}
                </h3>
                {customer && <Panel header={customer.name}>
                    <p>Account : {customer.acctNo}</p>
                    <p>Email : {customer.email}</p>
                    <p>Phone : {customer.phone}</p>
                    <Button icon="pi pi-check" className="p-button-success p-button-sm" label="Go Back"
                            onClick={() => navigate("/backend")}>
                    </Button>
                    <Button label="Delete" className="p-button-danger p-button-sm"
                            onClick={deleteCustomer}></Button>
                    </Panel>
                }
                {/* {loading && <h3>Loading...</h3>} */}
                { loading &&  getLoadingTag() }
                { errors && JSON.stringify(errors) }
            </div>
        </>
    )
}

export default CustDetails;
