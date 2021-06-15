<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 8/06/2021
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <a href="/customer?action=customer">List All Customer</a>
    </h2>
</div>


<div align="center">
    <form method="post" action="/customer">
        <table border="1" cellpadding="5" class="table table-striped table-bordered">
            <caption>
                <h2>Add New User</h2>
            </caption>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" value="<c:out value="${customer.name}"/>" size="45"/>
                </td>
            </tr>
            <tr>
                <th>birthday:</th>
                <td>
                    <input type="date" name="birthday" value="<c:out value="${customer.birthday}"/>" size="45"/>
                </td>
            </tr>
            <tr>
                <th>card:</th>
                <td>
                    <input type="text" name="card" value="<c:out value="${customer.card}"/>" size="45"/>
                </td>
            </tr>
            <tr>
                <th>phone number:</th>
                <td>
                    <input type="text" name="phoneNumber" value="<c:out value="${customer.phoneNumber}"/>" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" value="<c:out value="${customer.email}"/>" size="45"/>
                    <p style="color: red"><c:out value="${msgEmail}"/></p>
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" value="<c:out value="${customer.address}"/>" size="45"/>
                </td>
            </tr>
            <tr>
                <th>id loại khach:</th>
                <td>
                    <select name="typeId" id="typeId">
                        <c:forEach var="type" items="${list}">
                            <option value="${type.id}" ${type.id==customer.type.id?"selected":""} >${type.type}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="action" value="create"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
