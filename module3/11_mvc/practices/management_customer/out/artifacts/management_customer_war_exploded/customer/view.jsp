<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 28/05/2021
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["customer"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${requestScope["customer"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${requestScope["customer"].getAddress()}</td>
    </tr>
</table>

</body>
</html>
