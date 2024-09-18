import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import ForgotPassword from './components/ForgotPassword';
import SignUpForm from './components/SignUpForm';
import SigninForm from './components/SigninForm';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';



function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Navigate to="" />} />  {/* Redirect to sign-in by default */}
        <Route path="/SigninForm" element={<SigninForm />} />
        <Route path="/SignUpForm" element={<SignUpForm />} />
        <Route path="/ForgotPassword" element={<ForgotPassword />} />
        {/* Add other routes as necessary */}
        <Route path="*" element={<div>Page Not Found</div>} />
      </Routes>
    </Router>
  );
}

export default App;
