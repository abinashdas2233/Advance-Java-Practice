<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stock Dashboard</title>

<style>
    /* ===== Amazon Inspired Dashboard ===== */
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

    .menu {
        background-color: #ffffff;
        padding: 30px;
        width: 400px;
        border-radius: 6px;
        text-align: center;
        box-shadow: 0 2px 10px rgba(0,0,0,0.15);
    }

    a {
        display: block;
        margin: 12px 0;
        padding: 12px;
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

<div class="menu">
    <a href="create">create stock</a>
    <a href="view">view stock</a>
    <a href="update">update stock</a>
    <a href="delete">delete stock</a>
</div>

</body>
</html>
