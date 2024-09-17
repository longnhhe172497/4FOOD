import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import SignUpForm from './components/SignUpForm';
import SigninForm from './components/SigninForm';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';


function App() {
  return (
    <Router>
    <Routes>
      <Route path="/" element={<SigninForm />} />
      <Route path="/signup" element={<SignUpForm />} />
      {/* Add other routes as necessary */}
    </Routes>
  </Router>
  );
}

export default App;
