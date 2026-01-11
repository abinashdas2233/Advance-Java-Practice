<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>

<style>
    /* ===== Amazon Inspired Success Page ===== */
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background-color: #EAEDED;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .success-box {
        background-color: #ffffff;
        padding: 35px;
        width: 380px;
        border-radius: 6px;
        text-align: center;
        box-shadow: 0 2px 10px rgba(0,0,0,0.15);
    }

    h1 {
        color: #007600;
        margin-bottom: 15px;
        font-size: 24px;
    }

    p {
        color: #333;
        font-size: 14px;
        margin-bottom: 10px;
    }

    .userid {
        background-color: #F3F3F3;
        padding: 10px;
        margin: 15px 0;
        font-weight: bold;
        font-size: 16px;
        border-radius: 4px;
        color: #111;
    }

    a {
        display: inline-block;
        margin-top: 20px;
        padding: 10px 25px;
        background-color: #FFD814;
        color: #111;
        text-decoration: none;
        font-weight: bold;
        border-radius: 4px;
        border: 1px solid #FCD200;
        font-size: 14px;
    }

    a:hover {
        background-color: #F7CA00;
    }
</style>

</head>
<body>

<div class="success-box">
    <h1>Successfully Logged In</h1>
    <p>Your User ID is</p>
    <div class="userid">${displayUserId}</div>
    <a href="home">go to home</a>
</div>

</body>
</html>
