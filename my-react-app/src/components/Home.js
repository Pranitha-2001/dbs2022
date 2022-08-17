import React, { useState } from 'react'
import { useEffect } from 'react'

const Home = () => {
    const [count,setCount] = useState(0);

    useEffect(() => {
        document.body.style.backgroundColor = 'pink'
    })
    
    return (
        <div>
        <h2>Welcome to Home {count} <button onClick={() => setCount(count+10)}></button></h2>
        </div>
    )
}
export default Home