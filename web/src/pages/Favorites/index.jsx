import Header from '../../components/Header';
import './index.css';
import Loading from '../../components/Loading';

function Favorites() {
  const loading = true;

  return (
    <>
      <Header />
      {loading ? <Loading text="Loading Favorite List..." /> : null}
    </>
  );
}

export default Favorites;
