<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 7/06/2021
  Time: 1:53 PM
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
    <h1>Contract Management</h1>
    <h2>
        <a href="/contract?action=employee">List All Contract</a>
    </h2>
</div>


<div align="center">
    <form method="post" action="/contract">
        <table border="1" cellpadding="5" class="table table-striped table-bordered">
            <caption>
                <h2>Add New Contract</h2>
            </caption>
            <tr>
                <th>employee</th>
                <td>
                    <select name="employee" id="employee" class="form-control">
                        <c:forEach var="employee" items="${employeeList}">
                            <option value="${employee.id}"  >${employee.name}</option>

                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>department</th>
                <td>
                    <select name="customer" id="customer">
                        <c:forEach var="customer" items="${customerList}">
                            <option value="${customer.id}" >${customer.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <select name="service" id="service">
                        <c:forEach var="service" items="${ServiceList}">
                            <option value="${service.id}" >${service.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <th>start time:</th>
                <td>
                    <input type="date" name="startTime" id="startTime" size="45"/>
                </td>
            </tr>
            <tr>
                <th>end time:</th>
                <td>
                    <input type="date" name="endTime" id="endTime" size="45"/>
                </td>
            </tr>
            <tr>
                <th>deposit:</th>
                <td>
                    <input type="text" name="deposit" id="deposit" size="45"/>
                </td>
            </tr>
            <tr>
                <th>total:</th>
                <td>
                    <input type="text" name="total" id="total" size="45"/>
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
