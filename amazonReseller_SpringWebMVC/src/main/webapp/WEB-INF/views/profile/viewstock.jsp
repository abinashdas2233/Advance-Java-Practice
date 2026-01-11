<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Stock</title>

<style>
    /* ===== Amazon Inspired View Stock ===== */
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
        width: 360px;
        background-color: #ffffff;
        border-radius: 6px;
        padding: 25px;
        text-align: center;
        box-shadow: 0 2px 10px rgba(0,0,0,0.15);
    }

    h2 {
        color: #131921;
        margin-bottom: 20px;
    }

    p {
        font-size: 14px;
        color: #111;
        margin: 10px 0;
    }

    .status-box {
        margin-top: 15px;
        padding: 10px;
        border-radius: 4px;
        font-weight: bold;
    }

    .red {
        color: #B12704;
    }

    .orange {
        color: #E47911;
    }

    .green {
        color: #007600;
    }
</style>
</head>

<body>

<div class="box">
    <h2>Stock Details</h2>

    <%
        String name = (String) request.getAttribute("name");
        Integer quant = (Integer) request.getAttribute("quant");

        String status = "";

        if (quant == null || quant == 0) {
            status = "Out of Stock";
        } else if (quant <= 5) {
            status = "Low Stock";
        } else {
            status = "In Stock";
        }
    %>

    <p><b>Product Name:</b> <%= name %></p>
    <p><b>Quantity:</b> <%= quant %></p>

    <p>
        <b>Status:</b>
        <span class="<%= quant == null || quant == 0 ? "red" : (quant <= 5 ? "orange" : "green") %>">
            <%= status %>
        </span>
    </p>
</div>

</body>
</html>
