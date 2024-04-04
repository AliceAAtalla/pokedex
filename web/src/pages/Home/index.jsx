import Header from '../../components/Header';
import './index.css';
import Loading from '../../components/Loading';
import PokemonList from '../../components/PokemonList';
import useGetFetch from '../../hooks/useGetFetch';
import getFetchAllPokemons from '../../api/getFetchAllPokemons';

function Home() {
  const fetchUrl = getFetchAllPokemons("36", "0");
  const { data, loading } = useGetFetch(fetchUrl);

  return (
    <>
      <Header />
      {loading ? <Loading /> : null}
      {data && data.results.length ? <PokemonList pokemonList={data.results} /> : null}
    </>
  );
}

export default Home;
