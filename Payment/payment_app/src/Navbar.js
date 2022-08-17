import React from 'react'
import {Link} from 'react-router-dom'


export function Navbar() {
  return (
    <div>
    <Link to="/logger">Logger</Link>
    <Link to="/Customer">Customer</Link>
    <Link to="/Transferfunds">Transferfunds</Link>

    </div>
  )
}
