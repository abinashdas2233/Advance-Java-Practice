<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>

<style>
    /* ===== Amazon Inspired Registration Page ===== */
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

    h1 {
        text-align: center;
        color: #131921;
        margin-bottom: 20px;
        font-size: 24px;
    }

    form {
        background-color: #ffffff;
        padding: 30px;
        width: 320px;
        border-radius: 6px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.15);
    }

    input[type="text"],
    input[type="email"],
    input[type="password"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #a6a6a6;
        border-radius: 4px;
        font-size: 14px;
    }

    input:focus {
        outline: none;
        border-color: #F3A847;
        box-shadow: 0 0 3px #F3A847;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #FFD814;
        border: 1px solid #FCD200;
        border-radius: 4px;
        font-weight: bold;
        font-size: 14px;
        cursor: pointer;
        color: #111;
    }

    input[type="submit"]:hover {
        background-color: #F7CA00;
    }
</style>

</head>
<body>

<form method="post" action="registrationSubmit">
    <h1>This is registration page</h1>

    <input type="text" name="userName" placeholder="username">
    <input type="email" name="email" placeholder="Emailid">
    <input type="password" name="password" placeholder="Password">
    <input type="number" name="contactNo" placeholder="contact-number">
    <input type="submit" value="Register">
</form>

</body>
</html>
