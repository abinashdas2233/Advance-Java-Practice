<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Stock</title>

<style>
    /* ===== Amazon Inspired Create Stock Page ===== */
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

    .form-box {
        background-color: #ffffff;
        padding: 30px;
        width: 350px;
        border-radius: 6px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.15);
        text-align: center;
    }

    h1 {
        color: #131921;
        margin-bottom: 20px;
        font-size: 22px;
    }

    input[type="text"],
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

<div class="form-box">
    <h1>this is create stock page</h1>
    <form method="post" action="ordercreate">
        <input type="text" placeholder="product_name" name="product">
        <input type="number" placeholder="qunatity" name="quantity">
        <input type="submit" value="Create Stock">
    </form>
</div>

</body>
</html>
