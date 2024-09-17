import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Breadcrumb from './components/Breadcrumb';
import SignUpForm from './components/SignUpForm';

function App() {
  return (
    <div>
      {/* Breadcrumb Section */}s
      <Breadcrumb />

      {/* Sign Up Section */}
      <SignUpForm />
    </div>
  );
}

export default App;
