<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 28/05/2021
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product</h1>
<a href="/product?action=create">Create new product</a>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>delete</th>
        <th>edit</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.id}</td>
            <td><a href="/product?action=view&id=${product.getId()}">${product.name}</a></td>
            <td>${product.price}</td>
            <td><a href="/product?action=delete&id=${product.getId()}">delete</a></td>
            <td><a href="/product?action=edit&id=${product.getId()}">edit</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<form method="get" action="" >
    <input type="text" name="name" id="search">
    <input type="submit" name="action" value="search">
</form>


</body>
</html>
