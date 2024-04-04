const getFetchAllPokemons = (limit, offset) => {
  const limitQuery = limit ? '?limit=' + limit : '';
  const offsetQuery = offset ? '&offset=' + offset : '';
  const apiUrl = `http://localhost:8080/pokemons${limitQuery}${offsetQuery}`;

  return apiUrl;
};

export default getFetchAllPokemons;
