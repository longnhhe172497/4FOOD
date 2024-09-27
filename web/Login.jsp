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
        <style>
            /* Your CSS here */
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
                    <input type="text" id="user" name="user" required>
                </div>

                <div class="form-group">
                    <label for="pass">Password</label>
                    <input type="password" id="pass" name="pass" required>
                </div>

                <button type="submit" class="btn">Login</button>
            </form>
        </div>
    </body>
</html>
