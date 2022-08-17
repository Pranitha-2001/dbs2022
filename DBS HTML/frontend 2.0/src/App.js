import Header from "./components/Home/Header";
import Search from "./components/Other/Search";
import {BrowserRouter,Routes,Route} from 'react-router-dom'
import Login from "./components/Login/Login";
import Employee from "./components/Transfer/Employee";
import FailMessage from "./components/Login/FailMessage";
import About from "./components/Home/About";
import Logger from "./components/Transfer/Logger";
import Fundtransfer from "./components/Transfer/Fundtransfer";
import ValidateTransaction from "./components/Transfer/ValidateTransaction";
function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path='/' exact element={<Header/>}>
      <Route path='search'exact element={<Search/>}></Route>
      <Route path='login' exact element={<Login/>}></Route>
      <Route path='/employee' element={<Employee/>} ></Route>
      <Route path='/fundtransfer' element={<Fundtransfer/>}></Route>
      <Route path='/failmessage' element={<FailMessage/>}></Route>
      <Route path='/about' element={<About/>}></Route>
      <Route path='/logger' element={<Logger/>}></Route>
      <Route path='/validate' element={<ValidateTransaction/>}></Route>
      
      </Route>

    </Routes>
    </BrowserRouter>
    
  );
}

export default App;
