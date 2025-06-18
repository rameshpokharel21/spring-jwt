import "./App.css";

import Navbar from "./components/Navbar";
import useAuth from "./hooks/useAuth";
import Login from "./components/Login";
import SignUp from "./components/SignUp";
import { Navigate, Route, Routes } from "react-router-dom";
import Dashboard from "./components/Dashboard";

function App() {
  const { isAuthenticated } = useAuth();
  return (
    <div className="min-h-screen bg-gray-50">
      <Navbar />
      <main className="p-4">
        <Routes>
          <Route
            path="/login"
            element={!isAuthenticated ? <Login /> : <Navigate to="/" />}
          />
          <Route
            path="/signup"
            element={!isAuthenticated ? <SignUp /> : <Navigate to="/" />}
          />
          <Route
            path="/"
            element={isAuthenticated ? <Dashboard /> : <Navigate to="/login" />}
          />
        </Routes>
      </main>
    </div>
  );
}

export default App;
