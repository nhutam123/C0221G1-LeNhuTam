<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 28/05/2021
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${message != null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>id: </td>
                <td><input type="text" name="id" id="id" value="${product.getId()}"></td>
            </tr>
            <tr>
                <td>name: </td>
                <td><input type="text" name="name" id="name" value="${product.getName()}"></td>
            </tr>
            <tr>
                <td>price: </td>
                <td><input type="text" name="price" id="price" value="${product.getPrice()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update customer"></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
