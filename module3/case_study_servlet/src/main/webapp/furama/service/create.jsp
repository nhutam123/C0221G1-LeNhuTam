
<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 7/06/2021
  Time: 6:24 AM
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
    <h1>Service Management</h1>
    <h2>
        <a href="/service?action=employee">List All Service</a>
    </h2>
</div>


<div align="center">
    <form method="post" action="/service">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Service</h2>
            </caption>

            <tr>
                <th>Service Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>area</th>
                <td>
                    <input type="text" name="area" id="area" size="45">
                </td>
            </tr>
            <tr>
                <th>price</th>
                <td>
                    <input type="text" name="price" id="price">
                </td>
            </tr>
            <tr>
                <th>maxCustomer</th>
                <td>
                    <input type="text" name="maxCustomer" id="maxCustomer">
                </td>
            </tr>

            <tr>
                <th>Type:</th>
                <td>
                    <select name="type" id="type">
                        <c:forEach var="type" items="listType">
                            <option value="${type.id}">${type.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>rentalType:</th>
                <td>
                    <select name="rentalType" id="rentalType">
                        <c:forEach var="rentalType" items="listRentalType">
                            <option value="${rentalType.id}">${rentalType.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>status</th>
                <td>
                    <select name="status" id="status">
                        <option value="0">trống</option>
                        <option value="1">có khách</option>
                    </select>
                </td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
