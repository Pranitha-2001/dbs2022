import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Blog from './components/Blog';
import Contact from './components/Contact';
import Layout from './components/Layout';
import Settings from './components/Settings';
import Home from './components/Home';

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Layout />}>
          <Route index element={<Home />} />
          <Route path='Blog' element={<Blog />} />
          <Route path='Contact' element={<Contact />} />
          <Route path='Settings' element={<Settings />} />
        </Route>
      </Routes>
    </Router>
  );
}

export default App;
