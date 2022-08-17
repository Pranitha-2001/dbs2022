
import './App.css';

import Counter from './components/Counter';
import UserForm from './components/UserForm';
import Component1 from './components/Component1';
import Component2 from './components/Component2';
function App() {
  return (
    <div className="App">
     <UserForm/>
     <Counter/>
     <Component1/>
     <Component2/>
    </div>
  );
}

export default App;
