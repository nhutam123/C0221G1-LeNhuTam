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
    <style>
        .header {
            text-align: center;
            color: orange;
            background-color: bisque;
        }
        table{
            border: 1px solid chartreuse;
        }
        th {
            color: blue;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>User Management</h1>
    <h2>
        <a href="employee?action=employee">List All Users</a>
    </h2>
</div>

<div align="center">
    <form method="post" action="/employee">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Employee
                </h2>
            </caption>
            <c:if test="${employee != null}">
                <input type="hidden" name="id" value="<c:out value='${employee.id}' />"/>
            </c:if>

            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${employee.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>degree</th>
                <td>
                    <select name="degree" id="degree">
                        <option value="1">trung cap</option>
                        <option value="2">cao dang</option>
                        <option value="3">dai hoc</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>department</th>
                <td>
                    <select name="department" id="department">
                        <option value="1">Sale-Marketing</option>
                        <option value="2">Hành Chính</option>
                        <option value="3">Phục vụ</option>
                        <option value="4">Quản lý</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <select name="position" id="position">
                        <option value="1">le tan</option>
                        <option value="2">phuc vu</option>
                        <option value="3">chuyen vien</option>
                        <option value="4">giam sat</option>
                        <option value="5">quan ly</option>
                        <option value="6">giam doc</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>User birthday:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${employee.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User phoneNumber:</th>
                <td>
                    <input type="text" name="phoneNumber" size="45"
                           value="<c:out value='${employee.phoneNumber}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User card:</th>
                <td>
                    <input type="text" name="card" size="45"
                           value="<c:out value='${employee.card}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${employee.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" size="45"
                           value="<c:out value='${employee.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="action"  value="edit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
