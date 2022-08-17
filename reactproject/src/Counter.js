import React,{useState} from 'react'

const Counter = () => {
    const [counter,setCounter]= useState(0);
    return (
        <div>
            <h2 style={{color:'pink'}}>Counter {counter}</h2>
            <button onClick={()=>setCounter(counter+1)}>Increment</button>
            <input type ="text" value={input} onChange={(e)=>setInput(e.target.value)}></input</input>
            
        </div>
    )
}


export default Counter
