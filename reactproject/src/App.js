import User from "./User"; 
import Counter from "./Counter";
const App=()=>{
    return(
        <div>
            <h1>Welcome to React</h1>
             <User firstName = 'John' lastName='Doe' email='john@email.com'/>
             <User firstName = 'Pranni' lastName='#' email='pranni@email.com'/>
             
             <Counter/>
        </div>

    );
}
export default App;