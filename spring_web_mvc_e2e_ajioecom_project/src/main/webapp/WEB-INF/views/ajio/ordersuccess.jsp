<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJIO | Order Success</title>

<style>
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        background: linear-gradient(135deg, #0a0a0a, #1e1e1e);
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        align-items: center;
        justify-content: center;
        color: #ffffff;
    }

    .success-container {
        background-color: #000000;
        padding: 50px 60px;
        border-radius: 6px;
        text-align: center;
        box-shadow: 0 18px 40px rgba(0, 0, 0, 0.6);
        border: 1px solid #2b2b2b;
    }

    .success-container::before {
        content: "✓";
        display: block;
        font-size: 52px;
        margin-bottom: 15px;
        color: #ffffff;
    }

    .success-container p {
        font-size: 18px;
        letter-spacing: 1px;
        text-transform: capitalize;
        margin: 0;
    }
</style>

</head>
<body>

<div class="success-container">
    <p>this is order succes page</p>
</div>

</body>
</html>
