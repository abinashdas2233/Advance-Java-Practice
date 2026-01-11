<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Myntra | Register</title>

<style>
    /* Myntra Register Page Styling */
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

    h1 {
        text-align: center;
        color: #282C3F;
        margin-bottom: 25px;
        font-size: 28px;
    }

    form {
        background: #ffffff;
        padding: 35px;
        width: 350px;
        border-radius: 10px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.08);
    }

    input[type="text"],
    input[type="email"],
    input[type="password"],
    input[type="number"] {
        width: 100%;
        padding: 12px 14px;
        margin-bottom: 18px;
        border: 1px solid #d4d5d9;
        border-radius: 6px;
        font-size: 14px;
        outline: none;
        transition: border 0.3s ease;
    }

    input::placeholder {
        color: #94969f;
    }

    input:focus {
        border-color: #FF3F6C;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #FF3F6C;
        color: #ffffff;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: 600;
        cursor: pointer;
        transition: all 0.3s ease;
        box-shadow: 0 4px 10px rgba(255, 63, 108, 0.3);
    }

    input[type="submit"]:hover {
        background-color: #e7335c;
        box-shadow: 0 6px 14px rgba(255, 63, 108, 0.4);
        transform: translateY(-2px);
    }
</style>

</head>
<body>

    <form method="post" action="registerForm">
        <h1>Register</h1>

        <input type="text" placeholder="Username" name="userName">
        <input type="email" placeholder="Email ID" name="email">
        <input type="password" placeholder="Password" name="password">
        <input type="number" placeholder="Contact Number" name="contactNo">

        <input type="submit" value="Create Account">
    </form>

</body>
</html>
