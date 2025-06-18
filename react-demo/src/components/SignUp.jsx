import { useState } from "react";
import api from "../services/api";
import Spinner from "./Spinner";

const SignUp = () => {
  const [form, setForm] = useState({ username: "", email: "", password: "" });
  const [error, setError] = useState("");
  const [success, setSuccess] = useState("");
  const [isLoading, setIsLoading] = useState(false);

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError("");
    setSuccess("");
    setIsLoading(true);

    try {
      const res = await api.post("/auth/signup", form);
      setSuccess(
        "Signup successfully! You can now log in. Status: ",
        res.status
      );
      setForm({ username: "", email: "", password: "" });
    } catch (err) {
      setError(err.response?.data?.message || "Signup failed.");
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <form
      onSubmit={handleSubmit}
      className="max-w-md mx-auto bg-white shadow-md p-6 rounded mt-10"
    >
      <h2 className="text-xl font-semibold mb-4">Sign Up</h2>
      {error && <div className="text-red-500 mb-2">{error}</div>}
      {success && <div className="text-green-600 mb-2">{success}</div>}

      <input
        className="block w-full border px-3 py-2 mb-4 rounded"
        type="text"
        placeholder="username"
        value={form.username}
        key="username"
        id="username"
        name="username"
        onChange={handleChange}
      />

      <input
        className="block w-full border px-3 py-2 mb-4 rounded"
        type="text"
        placeholder="Email"
        value={form.email}
        key="email"
        id="email"
        name="email"
        onChange={handleChange}
      />

      <input
        className="block w-full border px-3 py-2 mb-4 rounded"
        type="password"
        placeholder="password"
        value={form.password}
        key="password"
        id="password"
        name="password"
        onChange={handleChange}
      />

      {isLoading ? (
        <Spinner />
      ) : (
        <button className="bg-green-500 text-white px-4 py-2 rounded hover:bg-green-600 w-full">
          Sign Up
        </button>
      )}
    </form>
  );
};

export default SignUp;
