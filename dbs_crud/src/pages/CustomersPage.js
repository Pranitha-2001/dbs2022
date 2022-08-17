import CustList from "../components/CustList";
import CustHtmlTable from "../components/CustHtmlTable";

function CustomersPage() {
    return (
        <div>
            <h3>List of Customers</h3>
            <CustList />
            <CustHtmlTable />
        </div>
    )
}

export default CustomersPage;