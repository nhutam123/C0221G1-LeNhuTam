<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 4/06/2021
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="header">
    <h1>Customer Management</h1>
    <h2>
        <a href="/customer?action=create&name=customer">Add New Customer</a>
    </h2>
    <div>
        <form method="post" action="/customer">
            <input class="search" type="text" name="name" id="search">
            <input class="btn btn-success" type="submit" name="action" value="search">
        </form>
        <br>
        <form action="" method="get">
            <input class="btn btn-danger" type="submit" name="action" value="sort">
        </form>
    </div>
</div>
</body>
</html>
