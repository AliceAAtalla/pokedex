import Navbar from '../Navbar';
import Logo from '../Logo';
import './index.css';

export default function Header() {

  return (
    <header className='header'>
      <Logo />
      <Navbar />
    </header>
  )
}
