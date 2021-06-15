<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 29/05/2021
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Contract</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">

    <style>
        .header {
            text-align: center;
            color: black;
            background-color: bisque;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>Contract Management</h1>
    <div class="d-flex justify-content-around">
        <div>
            <form method="get" action="/contract">
                <input class="btn btn-success" type="submit" name="action" value="create">
            </form>
        </div>

        <div>
            <form method="post" action="" >
                <input class="search" type="text" name="name" >
                <input class="btn btn-success" type="submit" name="action" value="search">
            </form>

        </div>

    </div>

</div>

<div align="center">
    <table border="1" cellpadding="5" class="table table-striped table-bordered table-dark">
        <caption><h2>List of contracts</h2></caption>
        <tr>
            <th>ID</th>
            <th>employee_id</th>
            <th>customer_id</th>
            <th>start_time</th>
            <th>end_time</th>
            <th>action</th>

        </tr>
        <c:forEach var="contract" items="${listContract}">
            <tr>
                <td><c:out value="${contract.id}"/></td>
                <td><c:out value="${contract.employee.name}"/></td>
                <td><c:out value="${contract.customer.name}"/></td>
                <td><c:out value="${contract.startTime}"/></td>
                <td><c:out value="${contract.endTime}"/></td>
                <td>
                    <a href="/contract?action=edit&id=${contract.id}">Edit</a>
                    <a href="/contract?action=delete&id=${contract.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<script>

</script>
</body>
</html>
