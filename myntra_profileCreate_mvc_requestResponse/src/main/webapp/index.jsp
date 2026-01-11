<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Myntra | Welcome</title>

<style>
    /* Myntra Brand Styling */
    body {
        margin: 0;
        padding: 0;
        font-family: 'Arial', sans-serif;
        background: linear-gradient(135deg, #fff0f4, #ffffff);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    h1 {
        color: #282C3F;
        font-size: 32px;
        margin-bottom: 20px;
        text-transform: capitalize;
    }

    a {
        display: inline-block;
        text-decoration: none;
        background-color: #FF3F6C; /* Myntra Pink */
        color: white;
        padding: 12px 28px;
        border-radius: 6px;
        font-size: 16px;
        font-weight: 600;
        transition: all 0.3s ease;
        box-shadow: 0 4px 10px rgba(255, 63, 108, 0.3);
    }

    a:hover {
        background-color: #e7335c;
        transform: translateY(-2px);
        box-shadow: 0 6px 14px rgba(255, 63, 108, 0.4);
    }

    body > * {
        text-align: center;
    }
</style>

</head>
<body>
    <div>
        <h1>welcome to index page</h1>
        <a href="registerpage">Click here to go to Register</a>
    </div>
</body>
</html>
