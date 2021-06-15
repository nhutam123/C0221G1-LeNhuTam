
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <style>
        .header {
            text-align: center;
            color: white;
            background-color: #333;
        }
        h2{
            color: #5cb85c;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>Service Management</h1>
</div>


<div class="container" align="center">
    <form method="post" action="/service">
        <div class="d-flex justify-content-around">
            <caption>
                <h2>Add New Service</h2>
            </caption>
            <h2>
                <a href="/service?action=employee">List All Service</a>
            </h2>
        </div>

        <table border="1" cellpadding="5" class="table table-striped table-bordered">

            <tr>
                <th>Service Name:</th>
                <td>
                    <input class="form-control" type="text" name="name" id="name" size="45" value="<c:out value="${service.name}"/>"/>
                </td>
            </tr>
            <tr>
                <th>area</th>
                <td>
                    <input class="form-control" type="text" name="area" id="area" size="45" value="<c:out value="${service.area}"/>">
                </td>
            </tr>
            <tr>
                <th>price</th>
                <td>
                    <input class="form-control" type="text" name="price" id="price" value="<c:out value="${service.price}"/>">
                </td>
            </tr>
            <tr>
                <th>maxCustomer</th>
                <td>
                    <input class="form-control" type="text" name="maxCustomer" id="maxCustomer" value="<c:out value="${service.maxCustomer}"/>">
                </td>
            </tr>

            <tr>
                <th>Type:</th>
                <td>
                    <select name="type" id="type" class="form-control">
                        <c:forEach var="type" items="${listType}">
                            <option value="${type.id}" ${type.id==service.type.id?"selected":""}>${type.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>rentalType:</th>
                <td>
                    <select class="form-control" name="rentalType" id="rentalType">
                        <c:forEach var="rentalType" items="${listRentalType}">
                            <option value="${rentalType.id}" ${rentalType.id==service.rentalType.id?"selected":""}>${rentalType.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>status</th>
                <td>
                    <select class="form-control" name="status" id="status">
                        <option value="<c:out value="${service.status}"/>" ><c:out value="${service.status==1?'có':'không'}"/></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input class="btn btn-success" type="submit" name="action" value="create"/>
                </td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
