<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 4/06/2021
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<h1>Employee search</h1>
<p>
    <a href="/employee">Back to Employee list</a>

</p>
<table>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td><c:out value="${employee.id}"/></td>
            <td><c:out value="${employee.name}"/></td>
            <td><c:out value="${employee.email}"/></td>
            <td><c:out value="${employee.address}"/></td>
<%--            <td><c:out value="${employee.position.position}"/></td>--%>
        </tr>
    </c:forEach>

</table>
</body>
</html>
