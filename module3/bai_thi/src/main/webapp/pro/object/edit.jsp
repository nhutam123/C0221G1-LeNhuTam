<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 8/06/2021
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <%--    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js">--%>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css">

    <style>
        .header {
            text-align: center;
            color: red;

        }
        #table {
            border: 1px slateblue;
            background-color: lightskyblue;
        }
    </style>
</head>
<div class="header">
    <h1>Customer Management</h1>
    <h2>
        <a href="customer?action=customer">List All Customer</a>
    </h2>
</div>

<div align="center" class="container">
    <form method="post" action="">
        <table id="table" border="1" cellpadding="5" class="table table-dark table-striped table-bordered">
            <caption>
                <h2>
                    Edit Customer
                </h2>
            </caption>
            <c:if test="${customer != null}">
                <input class="form-control" type="hidden" name="id" value="<c:out value='${customer.id}' />"/>
            </c:if>

            <tr>
                <th>User Name:</th>
                <td>
                    <input class="form-control" type="text" name="name" size="45"
                           value="<c:out value='${customer.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User birthday:</th>
                <td>
                    <input class="form-control" type="date" name="birthday" size="45"
                           value="<c:out value='${customer.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User phoneNumber:</th>
                <td>
                    <input class="form-control" type="text" name="phoneNumber" size="45"
                           value="<c:out value='${customer.phoneNumber}' />"/>
                </td>
            </tr>
            <tr>
                <th>User card:</th>
                <td>
                    <input class="form-control" type="text" name="card" size="45"
                           value="<c:out value='${customer.card}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input class="form-control" type="text" name="email" size="45"
                           value="<c:out value='${customer.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input class="form-control" type="text" name="address" size="45"
                           value="<c:out value='${customer.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input class="btn btn-danger" type="submit"  value="edit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
