<html>
<head>
    <title>Shop Management System - Register</title>
    <link rel="stylesheet " href="style.css">
</head>
<body>
    <div class="main">
        <h1>Shop Management System</h1>
        <h3>Register</h3>
        <form action="register">
            <label for="name">Name:</label>
            <input type="text" id="name" name="nm" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="em" required>
            <label for="phoneNumber">Phone Number:</label>
            <input type="tel" id="phoneNumber" name="ph" required>
            <label for="password">Password:</label>	
            <input type="text" id="password" name="ps" required>
            <label for="confirmPassword">Confirm Password:</label>
            <input type="text" id="confirmPassword" name="cps" required>
            <p style="color: red;">${error}</p>
            <button type="submit">Register</button>
        </form>
        <p>Already have an account? <a href="login.jsp">Login</a></p>
    </div>
</body>
</html>