import Header from '../../components/Header';
import Loading from '../../components/Loading';
import PokemonList from '../../components/PokemonList';
import useGetFetch from '../../hooks/useGetFetch';
import getFetchAllPokemons from '../../api/getFetchAllPokemons';
import './index.css';

function Home() {
  const fetchUrl = getFetchAllPokemons("36", "0");
  const { data, loading } = useGetFetch(fetchUrl);

  return (
    <>
      <Header />
      {loading ? <Loading text="Loading Pokemons..." /> : null}
      {data && data.results.length > 0 ? <PokemonList pokemonList={data.results} /> : null}
    </>
  );
}

export default Home;
