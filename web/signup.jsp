<%-- 
    Document   : signup
    Created on : Sep 27, 2024, 9:32:09 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up</title>

        <style>
            /* Basic CSS styling here */
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

            .signup-container {
                width: 100%;
                max-width: 400px;
                background-color: #fff;
                padding: 40px;
                box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.1);
                border-radius: 10px;
                text-align: center;
            }

            .signup-container h2 {
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

            .signup-container p {
                margin-top: 20px;
                font-size: 14px;
                color: #666;
            }

            .signup-container a {
                color: #007bff;
                text-decoration: none;
            }

            .signup-container a:hover {
                text-decoration: underline;
            }
        </style>
    </head>
    <body>

        <div class="signup-container">
            <h2>Sign Up</h2>

            <!-- Display error message if signup fails -->
            <c:if test="${not empty mess}">
                <div class="error-message">${mess}</div>
            </c:if>

            <form action="SignupController" method="POST">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" id="username" name="username" required>
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                </div>

                <div class="form-group">
                    <label for="fullName">Full Name</label>
                    <input type="text" id="fullName" name="fullName" required>
                </div>

                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" required>
                </div>

                <div class="form-group">
                    <label for="phone">Phone</label>
                    <input type="text" id="phone" name="phone" required>
                </div>

                <div class="form-group">
                    <label for="address">Address</label>
                    <input type="text" id="address" name="address" required>
                </div>

                <button type="submit" class="btn">Sign Up</button>
            </form>

            <p>Already have an account? <a href="Login.jsp">Login</a></p>
        </div>

    </body>
</html>
