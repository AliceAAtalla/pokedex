import { NavLink } from "react-router-dom"
import "./index.css"

export default function Navbar() {

  return (
    <nav className="navbar">
      <ul>
        <li><NavLink to="/">Home</NavLink></li>
        <li><NavLink to="favorites">Favoritos</NavLink></li>
      </ul>
    </nav>
  )
}
