
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>StaffSignup</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
            max-width: 500px;
            margin: 0 auto;
        }
        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button[type="submit"]:hover {
            background-color: #45a049;
        }
        .error {
            color: red;
        }
        .success {
            color: green;
        }
    </style>
</head>
<body>

    <h2>StaffSignupForm</h2>

    <!-- Display success or error message -->
    <div class="error">
        <!-- This area can be used to display error messages -->
        <!-- Example: Password must contain at least one uppercase letter. -->
    </div>

    <form action="SignupStaff" method="post">
        <!-- Staff Name -->
        <label for="staffName">Staff Name:</label>
        <input type="text" id="staffName" name="staffName" required>

        <!-- Staff Email -->
        <label for="staffEmail">Email:</label>
        <input type="email" id="staffEmail" name="staffEmail" required>

        <!-- Staff ID -->
        <label for="staffID">Staff ID:</label>
        <input type="text" id="staffID" name="staffID" required>

        <!-- Department -->
        <label for="department">Department:</label>
        <input type="text" id="department" name="department" required>

        <!-- Password -->
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <!-- Submit Button -->
        <button type="submit">Sign Up</button>
    </form>

</body>
</html>
