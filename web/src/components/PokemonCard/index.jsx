import PropTypes from 'prop-types';
import "./index.css"

export default function PokemonCard({ pokemon }) {
  return (
    <div className='pokemon-card-wrapper'>
      <p>  
        {pokemon.name}
      </p>
    </div>
  )
}

PokemonCard.propTypes = {
  pokemon: {
    name: PropTypes.string
  }
};
