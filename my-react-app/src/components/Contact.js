import React,{useEffect, useState} from 'react'
const Contact = ()=>{
    const API = 'hhtps://api.github.com/users';
    const [users,setUsers] = useState([]);
    useEffect(() => {
        fetch(API)
        .then(response => response.json)
        .then(response => setUsers(response));
    }, [])
    return (
        <div>
        <h1>Change Contact</h1>
        <ul>
          {
            users.map(user => {
                <li>{user.login}</li>
            })
          }
        </ul></div>
    )
}
export default Contact