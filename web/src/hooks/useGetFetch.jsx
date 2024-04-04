import { useEffect, useState } from 'react';
import getRequestWithNativeFetch from '../api/getRequestWithNativeFetch';

const useGetFetch = (apiUrl) => {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const options = {
          method: 'GET',
          'Content-Type': 'application/json',
        }
        const result = await getRequestWithNativeFetch(apiUrl, options);
        setData(result);
        setError(null);
      } catch (err) {
        setError(err.message);
        setData(null);
        console.log(err.message);
      } finally {
        setLoading(false);
      }
    };

    fetchData();
  }, [apiUrl]);

  return {
    data, loading, error
  };
};

export default useGetFetch;
