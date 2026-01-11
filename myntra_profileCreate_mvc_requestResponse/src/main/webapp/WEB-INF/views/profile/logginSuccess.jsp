<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Myntra | Success</title>

<style>
    /* Myntra Success Page Styling */
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #fff0f4, #ffffff);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .success-card {
        background: #ffffff;
        padding: 40px;
        width: 420px;
        text-align: center;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.08);
    }

    .success-icon {
        font-size: 50px;
        color: #FF3F6C;
        margin-bottom: 15px;
    }

    h1 {
        color: #282C3F;
        font-size: 26px;
        margin-bottom: 12px;
    }

    p {
        font-size: 16px;
        color: #535766;
        margin-top: 10px;
    }

    .userid {
        display: inline-block;
        margin-top: 12px;
        padding: 10px 18px;
        background: #f5f5f6;
        border-radius: 6px;
        font-weight: 600;
        color: #FF3F6C;
        letter-spacing: 0.5px;
    }

    .home-btn {
        display: inline-block;
        margin-top: 25px;
        text-decoration: none;
        background-color: #FF3F6C;
        color: #ffffff;
        padding: 12px 26px;
        border-radius: 6px;
        font-size: 15px;
        font-weight: 600;
        transition: all 0.3s ease;
        box-shadow: 0 4px 10px rgba(255, 63, 108, 0.3);
    }

    .home-btn:hover {
        background-color: #e7335c;
        transform: translateY(-2px);
        box-shadow: 0 6px 14px rgba(255, 63, 108, 0.4);
    }
</style>

</head>
<body>

    <div class="success-card">
        <div class="success-icon">✔</div>
        <h1>Successfully Logged In</h1>
        <p>Your User ID is</p>
        <div class="userid">${displayUserId}</div>

        <br>
        <a href="index" class="home-btn">Go to Home</a>
    </div>

</body>
</html>
