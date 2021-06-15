<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 8/06/2021
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer search</h1>
<p>
    <a href="/customer">Back to Customer list</a>

</p>
<table>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td><c:out value="${customer.id}"/></td>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.email}"/></td>
            <td><c:out value="${customer.address}"/></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
