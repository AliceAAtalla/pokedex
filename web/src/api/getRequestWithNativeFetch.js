const getRequestWithNativeFetch = async (apiUrl, options) => {
  const response = await fetch(apiUrl, {
    ...options
  });

  if (!response.ok) {
    throw new Error(`HTTP error: Status ${response.status}`);
  }

  let result = await response.json();

  return result;
};

export default getRequestWithNativeFetch;
