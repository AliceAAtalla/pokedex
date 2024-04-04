const getRequestWithNativeFetch = async (apiUrl) => {
  const response = await fetch(apiUrl, {
    method: 'GET',
    'Content-Type': 'application/json', 
  });

  if (!response.ok) {
    throw new Error(`HTTP error: Status ${response.status}`);
  }

  let result = await response.json();

  return result;
};

export default getRequestWithNativeFetch;
