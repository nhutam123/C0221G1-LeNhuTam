<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 28/05/2021
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete customer</h1>

<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${product.getId()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
