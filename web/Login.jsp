<%-- 
    Document   : Login
    Created on : Sep 27, 2024, 8:31:44 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <!-- Include Google's reCAPTCHA library -->
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            .login-container {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            h2 {
                margin-bottom: 20px;
                text-align: center;
            }

            .form-group {
                margin-bottom: 15px;
            }

            .form-group label {
                display: block;
                margin-bottom: 5px;
            }

            .form-group input {
                width: 100%;
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }

            .form-group .g-recaptcha {
                margin: 15px 0;
            }

            .btn {
                display: inline-block;
                padding: 10px 20px;
                background-color: #28a745;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                text-align: center;
                width: 100%;
            }

            .btn:hover {
                background-color: #218838;
            }

            .error-message {
                color: red;
                margin-bottom: 15px;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>Login</h2>

            <!-- Display error message if available -->
            <c:if test="${not empty mess}">
                <div class="error-message">${mess}</div>
            </c:if>

            <!-- Form for username, password, and captcha -->
            <form action="LoginController" method="POST">
                <div class="form-group">
                    <label for="user">Username</label>
                    <input type="text" id="user" name="user" required>
                </div>

                <div class="form-group">
                    <label for="pass">Password</label>
                    <input type="password" id="pass" name="pass" required>
                </div>

                <!-- Google reCAPTCHA widget -->
                <div class="g-recaptcha" data-sitekey="YOUR_RECAPTCHA_SITE_KEY"></div>

                <button type="submit" class="btn">Login</button>
            </form>
        </div>
    </body>
</html>
