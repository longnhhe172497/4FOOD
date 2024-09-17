import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Breadcrumb from './Breadcrumb';
import SignUpForm from './SignUpForm';

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
