import React from "react";
import useCounter from "../hooks/useCounter";
function Counter(){
    const[count,increment,decrement,reset]=useCounter(0,1)
    return(
        <div>
            <h2>Count={count}</h2>
            <button onClick={increment}>increment</button>
            <button onClick={decrement}>decrement</button>
            <button onClick={reset}>Reset</button>
        </div>
    )
}
export default Counter;