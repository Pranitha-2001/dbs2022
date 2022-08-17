import React from 'react'
import {Link} from 'react-router-dom' 
export function Navbar() {
    return (
        <div>
            <Link to="/">Home</Link>
            <Link to="/customer">Customer</Link>
            <Link to="/about">About</Link>

        </div>
    )
}