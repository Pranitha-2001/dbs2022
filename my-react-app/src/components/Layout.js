import { Outlet, Link } from "react-router-dom";
const Layout = () => {
  return (
    <div>
      <nav>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/Blog">Blog</Link>
          </li>
          <li>
            <Link to="/Contact">Contact</Link>
          </li>
          <li>
            <Link to="/Settings">Settings</Link>
          </li>
        </ul>
      </nav>
      <Outlet />
    </div>
  )};

export default Layout;
