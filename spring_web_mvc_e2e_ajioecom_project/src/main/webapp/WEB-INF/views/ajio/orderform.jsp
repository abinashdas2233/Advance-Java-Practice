<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJIO | Order</title>

<style>
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        background: linear-gradient(135deg, #0c0c0c, #1a1a1a);
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    form {
        background-color: #ffffff;
        width: 360px;
        padding: 35px 30px;
        border-radius: 6px;
        box-shadow: 0 15px 35px rgba(0, 0, 0, 0.5);
    }

    form::before {
        content: "AJIO ORDER";
        display: block;
        text-align: center;
        font-size: 20px;
        font-weight: 700;
        letter-spacing: 2px;
        margin-bottom: 25px;
        color: #111;
    }

    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 12px 14px;
        margin-bottom: 18px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
        outline: none;
        transition: border-color 0.3s ease;
    }

    input::placeholder {
        text-transform: capitalize;
        color: #888;
    }

    input[type="text"]:focus,
    input[type="number"]:focus {
        border-color: #000;
    }

    input[type="submit"] {
        width: 100%;
        padding: 14px;
        background-color: #000000;
        color: #ffffff;
        border: none;
        border-radius: 4px;
        font-size: 15px;
        font-weight: 600;
        letter-spacing: 1px;
        text-transform: uppercase;
        cursor: pointer;
        transition: all 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #1c1c1c;
        transform: translateY(-2px);
        box-shadow: 0 8px 18px rgba(0, 0, 0, 0.4);
    }
</style>

</head>
<body>

<form action="ordersubmit" method="post">
    <input type="text" placeholder="enter productname" name="name">
    <input type="number" placeholder="enter price" name="price">
    <input type="text" placeholder="enter address" name="address">
    <input type="submit">
</form>

</body>
</html>
