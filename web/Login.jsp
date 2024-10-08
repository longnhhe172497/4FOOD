<%-- 
    Document   : Login
    Created on : Sep 27, 2024, 8:31:44 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>

        <!-- Import Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">

        <!-- Basic CSS styling -->
        <style>
            body {
                margin: 0;
                padding: 0;
                font-family: 'Poppins', sans-serif;
                background: #f5f5f5;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            .login-container {
                width: 100%;
                max-width: 400px;
                background-color: #fff;
                padding: 40px;
                box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.1);
                border-radius: 10px;
                text-align: center;
            }

            .login-container h2 {
                font-size: 28px;
                margin-bottom: 20px;
                color: #333;
            }

            .form-group {
                margin-bottom: 15px;
                text-align: left;
            }

            .form-group label {
                display: block;
                font-size: 14px;
                color: #555;
                margin-bottom: 5px;
            }

            .form-group input {
                width: 100%;
                padding: 12px;
                font-size: 14px;
                border: 1px solid #ddd;
                border-radius: 5px;
                outline: none;
                transition: border-color 0.3s;
            }

            .form-group input:focus {
                border-color: #007bff;
            }

            .error-message {
                color: red;
                font-size: 14px;
                margin-bottom: 15px;
            }

            .form-group input[type="checkbox"] {
                display: inline-block;
                width: auto;
                margin-right: 5px;
            }

            .form-group label[for="remember"] {
                display: inline;
                font-size: 14px;
            }

            .btn {
                background-color: #007bff;
                color: #fff;
                font-size: 16px;
                padding: 12px 0;
                border: none;
                border-radius: 5px;
                width: 100%;
                cursor: pointer;
                transition: background-color 0.3s;
            }

            .btn:hover {
                background-color: #0056b3;
            }

            .login-container p {
                margin-top: 20px;
                font-size: 14px;
                color: #666;
            }

            .login-container a {
                color: #007bff;
                text-decoration: none;
            }

            .login-container a:hover {
                text-decoration: underline;
            }

            .login-container small {
                display: block;
                margin-top: 20px;
                color: #aaa;
            }
        </style>
    </head>
    <body>

        <div class="login-container">
            <h2>Login</h2>

            <!-- Display error message if login fails -->
            <c:if test="${not empty mess}">
                <div class="error-message">${mess}</div>
            </c:if>

            <form action="LoginController" method="POST">
                <div class="form-group">
                    <label for="user">Username</label>
                    <input type="text" id="user" name="user" value="${cookie.username.value}" required>
                </div>

                <div class="form-group">
                    <label for="pass">Password</label>
                    <input type="password" id="pass" name="pass" value="${cookie.password.value}" required>
                </div>

                <!-- Remember Me Checkbox -->
                <div class="form-group">
                    <input type="checkbox" id="remember" name="remember" ${(cookie.crem!=null?'checked':'')} value="ON">
                    <label for="remember">Remember Me</label>
                </div>

                <button type="submit" class="btn">Login</button>
            </form>

            <p>Don't have an account? <a href="signup.jsp">Sign Up</a></p>

            <small>&copy; 2024 Your Company. All rights reserved.</small>
        </div>

    </body>
</html>