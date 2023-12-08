import { useState } from 'react';

const Register = () => {
    const [username, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleRegister = async (e) => {
        e.preventDefault();
        try {
            // Trimite cererea către server pentru înregistrare
            const response = await fetch('URL_DE_INREGISTRARE', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ username, email, password }),
            });
            const data = await response.json();
            console.log(data); // Poți trata răspunsul de la server aici
        } catch (error) {
            console.error('Eroare de înregistrare:', error);
        }
    };

    return (
        <div>
            <h2>Înregistrare</h2>
            <form onSubmit={handleRegister}>
                <input
                    type="text"
                    placeholder="Utilizator"
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                />
                <input
                    type="email"
                    placeholder="Adresă de email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />
                <input
                    type="password"
                    placeholder="Parolă"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
                <button type="submit">Înregistrare</button>
            </form>
        </div>
    );
};

export default Register;
