import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import SignUpForm from './components/SignUpForm';
import SigninForm from './components/SigninForm';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';


function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Navigate to="/SigninForm" />} />  {/* Redirect to sign-in by default */}
        <Route path="/SigninForm" element={<SigninForm />} />
        <Route path="/SignUpForm" element={<SignUpForm />} />
        {/* Add other routes as necessary */}
      </Routes>
    </Router>
  );
}

export default App;
