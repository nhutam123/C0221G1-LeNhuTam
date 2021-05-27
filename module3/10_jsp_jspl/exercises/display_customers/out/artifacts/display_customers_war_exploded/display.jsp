<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 27/05/2021
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table>
    <tr>
      <th>Name</th>
      <th>Birthday</th>
      <th>Address</th>
      <th>Image</th>
    </tr>
    <c:forEach items="${list}" var="customer">
      <tr>
        <td><c:out value="${customer.name}"></c:out></td>
        <td><c:out value="${customer.birthday}"></c:out></td>
        <td><c:out value="${customer.address}"></c:out></td>
        <td><img src=<c:out value="${customer.image}"></c:out> alt="anh"></td>
      </tr>
    </c:forEach>

  </table>

  </body>
</html>
