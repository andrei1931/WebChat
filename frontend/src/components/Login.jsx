import  { useState } from 'react';

const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      // Trimite cererea către server pentru autentificare
      const response = await fetch('URL_DE_AUTENTIFICARE', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username, password }),
      });
      const data = await response.json();
      console.log(data); // Poți trata răspunsul de la server aici
    } catch (error) {
      console.error('Eroare de autentificare:', error);
    }
  };

  return (
    <div>
      <h2>Logare</h2>
      <form onSubmit={handleLogin}>
        <input
          type="text"
          placeholder="Utilizator"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <input
          type="password"
          placeholder="Parolă"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <button type="submit">Logare</button>
      </form>
    </div>
  );
};

export default Login;
