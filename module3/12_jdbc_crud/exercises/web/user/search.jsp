<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 31/05/2021
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User details</h1>
<p>
    <a href="/user">Back to User list</a>
</p>
<table>
    <tr>
        <td>id: </td>
        <td>${user.getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${user.getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${user.getEmail()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${user.getCountry()}</td>
    </tr>

</table>

</body>
</html>
