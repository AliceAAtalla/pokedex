import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home"
import Favorites from "./pages/Favorites"

export default function Navigation() {

  return (
    <BrowserRouter>
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/favorites" element={<Favorites />} />
      </Routes>
    </BrowserRouter>
  )
}
