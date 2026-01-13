<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJIO Home</title>

<style>
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #0a0a0a, #1c1c1c);
        display: flex;
        align-items: center;
        justify-content: center;
    }

    a {
        text-decoration: none;
        color: #ffffff;
        background-color: #2b2b2b;
        padding: 16px 40px;
        font-size: 18px;
        font-weight: 600;
        letter-spacing: 1px;
        border-radius: 4px;
        border: 1px solid #444;
        text-transform: uppercase;
        transition: all 0.3s ease;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.4);
    }

    a:hover {
        background-color: #000000;
        border-color: #ffffff;
        transform: translateY(-3px);
        box-shadow: 0 12px 25px rgba(0, 0, 0, 0.6);
    }
</style>

</head>
<body>
    <a href="orderpage">Click here to go order page</a>
</body>
</html>
