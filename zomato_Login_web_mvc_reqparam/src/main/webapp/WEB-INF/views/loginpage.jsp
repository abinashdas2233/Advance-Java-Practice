<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato - Login</title>

<style>
    body {
        font-family: 'Segoe UI', Arial, sans-serif;
        background-color: #fff5f5;
        margin: 0;
        padding: 0;
    }

    .login-container {
        width: 360px;
        margin: 120px auto;
        padding: 30px;
        background-color: #ffffff;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.12);
    }

    .brand {
        text-align: center;
        font-size: 38px;
        font-weight: bold;
        color: #E23744;
        margin-bottom: 10px;
        letter-spacing: 1px;
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        font-weight: 600;
        color: #444;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 12px;
        margin-top: 6px;
        margin-bottom: 18px;
        border: 1px solid #ddd;
        border-radius: 6px;
        font-size: 14px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #E23744;
        border: none;
        color: white;
        font-size: 16px;
        font-weight: bold;
        border-radius: 6px;
        cursor: pointer;
        transition: 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #c91f32;
        transform: scale(1.02);
    }
</style>

</head>
<body>

<div class="login-container">

    <div class="brand">zomato</div>
    <h2>Login</h2>

    <form action="logdata" method="post">
        <label>User ID</label>
        <input type="text" name="userId" placeholder="Enter User ID" required>

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter Password" required>

        <input type="submit" value="Login">
    </form>

</div>

</body>
</html>
