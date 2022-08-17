import React from 'react'
import './User.css';
const User = (props) => {
    return (
        <div>
           <h1>Hey,My FirstName:{props.firstName}</h1> 
           <h2>My LastName:{props.lastName}</h2> 
        
           <h1 style={{color: "pink"}}>Hello Style!</h1>
           
        </div>
    )
}

export default User
