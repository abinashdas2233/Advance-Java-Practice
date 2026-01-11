<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Stock</title>

<style>
    /* ===== Amazon Inspired Delete Stock Page ===== */
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

    .box {
        background-color: #ffffff;
        padding: 30px;
        width: 360px;
        border-radius: 6px;
        text-align: center;
        box-shadow: 0 2px 10px rgba(0,0,0,0.15);
    }

    h1 {
        color: #B12704; /* Amazon-style red for delete */
        margin-bottom: 20px;
        font-size: 22px;
    }

    a {
        display: inline-block;
        margin-top: 15px;
        padding: 12px 30px;
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

<div class="box">
    <h1>Delete Stock Page</h1>
    <a href="deleteing">Click here to delete stock</a>
</div>

</body>
</html>
