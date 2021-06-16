<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 15/06/2021
  Time: 7:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Spices </h1>
<c:forEach var="spice" items="${listSpice}">
    <c:out value="${spice}"/>
    <br>
</c:forEach>

</body>
</html>
