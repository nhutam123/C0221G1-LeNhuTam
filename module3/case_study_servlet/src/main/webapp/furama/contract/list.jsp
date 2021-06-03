<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 29/05/2021
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h2>
        <a href="/user?action=create">Add New Contract</a>
    </h2>
</div>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of contracts</h2></caption>
        <tr>
            <th>ID</th>
            <th>employee_id</th>
            <th>customer_id</th>
            <th>start_time</th>
            <th>end_time</th>
            <th>action</th>

        </tr>
        <c:forEach var="contract" items="${listContracts}">
            <tr>
                <td><c:out value="${contract.id}"/></td>
                <td><c:out value="${contract.employee_id}"/></td>
                <td><c:out value="${contract.customer_id}"/></td>
                <td><c:out value="${contract.start_time}"/></td>
                <td><c:out value="${contract.end_time}"/></td>
                <td>
                    <a href="/user?action=edit&id=${user.id}">Edit</a>
                    <a href="/user?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <form method="post" action="" >
        <input class="search" type="text" name="name" id="search">
        <input class="btn btn-success" type="submit" name="action" value="search">
    </form>
    <br>
    <form action="" method="get">
        <input class="btn btn-danger" type="submit" name="action" value="sort">
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<script>

</script>
</body>
</html>
