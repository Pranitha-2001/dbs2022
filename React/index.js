import React from "react"
import  ReactDOM  from "react-dom"
function Temp() {
    return (
        <div>
            <h1>Hello</h1>
            <ol>
                <li>Hi</li>
                <li>world</li>
            </ol>
        </div>
    )
}
ReactDOM.render(<Temp/>,document.getElementById("root"))