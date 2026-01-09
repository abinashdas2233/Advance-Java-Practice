<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato - Login Successful</title>

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

    .success-card {
        background: #ffffff;
        padding: 40px 60px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0,0,0,0.12);
    }

    .brand {
        font-size: 42px;
        font-weight: bold;
        color: #E23744;
        margin-bottom: 10px;
    }

    .message {
        font-size: 20px;
        color: #333;
        margin: 20px 0;
    }

    .check {
        font-size: 60px;
        color: #28a745;
        margin-bottom: 10px;
    }

    .home-btn {
        display: inline-block;
        margin-top: 20px;
        text-decoration: none;
        background: #E23744;
        color: white;
        padding: 12px 30px;
        border-radius: 6px;
        font-size: 16px;
        transition: 0.3s ease;
    }

    .home-btn:hover {
        background: #c91f32;
        transform: scale(1.05);
    }
</style>

</head>
<body>

    <div class="success-card">
        <div class="brand">zomato</div>
        <div class="check">✔</div>
        <div class="message">Login Successful!</div>
        
    </div>

</body>
</html>
