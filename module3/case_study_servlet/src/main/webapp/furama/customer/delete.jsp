<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 2/06/2021
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .header {
            text-align: center;
            color: orange;
            background-color: bisque;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>Customer Management</h1>
    <h2>
        <a href="customer?action=customer">List All Customer</a>
    </h2>
</div>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5" class="table table-striped table-bordered">
            <caption>
                <h2>
                    Edit Customer
                </h2>
            </caption>
            <c:if test="${user != null}">
                <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>
            </c:if>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${user.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${user.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" size="15"
                           value="<c:out value='${user.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
