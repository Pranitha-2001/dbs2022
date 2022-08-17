import { useState } from "react";
function useCounter(initial=0,value){
    
    const[count,setCount]=useState(initial)
    const increment=()=>{setCount(prevCount=>prevCount+value)}
    const decrement=()=>{setCount(prevCount=>prevCount-value)}
    const reset=()=>{setCount(initial)}
    return[count,increment,decrement,reset];
   
}
export default useCounter;