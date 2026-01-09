<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato Login</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Arial, sans-serif;
        background: #fff5f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background: white;
        padding: 40px 60px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 8px 20px rgba(0,0,0,0.1);
    }

    .brand {
        font-size: 42px;
        font-weight: bold;
        color: #E23744; /* Zomato red */
        margin-bottom: 20px;
        letter-spacing: 1px;
    }

    .login-btn {
        display: inline-block;
        text-decoration: none;
        background: #E23744;
        color: white;
        padding: 12px 30px;
        font-size: 16px;
        border-radius: 6px;
        transition: 0.3s ease;
    }

    .login-btn:hover {
        background: #c91f32;
        transform: scale(1.05);
    }
</style>

</head>
<body>

    <div class="container">
        <div class="brand">zomato</div>
        <a href="login" class="login-btn">Login</a>
    </div>

</body>
</html>
