import PropTypes from 'prop-types';

import "./index.css"
import PokemonCard from '../PokemonCard';

export default function PokemonList({ pokemonList }) {
  return (
    <div className='pokemon-list-wrapper'>
      {
        pokemonList.map((pokemon) => (
          <PokemonCard key={pokemon.name} pokemon={pokemon} />
        ))
      }
    </div>
  )
}


PokemonList.propTypes = {
  pokemonList: {
    pokemon: PropTypes.object,
  }
};
