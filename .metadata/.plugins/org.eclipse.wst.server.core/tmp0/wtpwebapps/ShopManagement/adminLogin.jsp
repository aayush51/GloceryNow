<html>
<head>
    <title>Shop Management System - Admin Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="main">
        <h1>Shop Management System Admin</h1>
        <h3>Admin Login</h3>
        <form action="adminlogin">
            <label for="email">Email:</label>
            <input type="email" id="email" name="em" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="ps" required>
            <p style="color: red;">${error}</p>
            <button type="submit">Login</button>
            <button class="btn" onclick="location.href='index.jsp'"><%= "<" %></button><button class="btn" onclick="location.href='login.jsp'">&#10227;</button>
            
        </form>
    </div>
</body>
</html>