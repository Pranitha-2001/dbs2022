import axios from 'axios'
import React,{useEffect, useState} from 'react'

const Logger = () => {
    const [logdata, setlogdata] = useState([])
    const URL=`http://localhost:8083/paymentapp/getloggersbycustid/${513620}`
    const getlog=async()=>{
        const {data}=await axios.get(URL)
        setlogdata(data)
        console.log(logdata);
    }
    useEffect(()=>{
    getlog()
    },[])
    return (
        <div>
            <p>Hello{JSON.stringify(logdata)}</p>
            <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td colspan="2">Larry the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>
        </div>
    )
}

export default Logger
