<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 29/05/2021
  Time: 8:34 PM
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
            color: blue;
            background-color: bisque;
        }
    </style>
</head>
<body>
<div class="header">
    <div>
        <h1>Employee Management</h1>
        <h2>
            <a href="furama/employee/create.jsp">Add New Employee</a>
        </h2>
    </div>
    <div>
        <form method="post" action="/employee">
            <input class="search" type="text" name="name" id="search">
            <input class="btn btn-success" type="submit" name="action" value="search">
        </form>
    </div>
</div>

<div align="center">
    <table border="1" cellpadding="5" id="table" class="table table-striped table-bordered">
        <caption><h2>List of Employee</h2></caption>
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>address</th>
            <th>position</th>
            <th>Actions</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${listEmployee}">
            <tr>
                <td><c:out value="${employee.id}"/></td>
                <td><c:out value="${employee.name}"/></td>
                <td><c:out value="${employee.email}"/></td>
                <td><c:out value="${employee.address}"/></td>
                <td><c:out value="${employee.position.position}"/></td>
                <td>
                    <a href="/employee?action=edit&id=${employee.id}">Edit</a>
                    <button type="button" class="btn btn-danger"
                            onclick="sendDataToModal('${employee.id}','${employee.name}')" data-toggle="modal"
                            data-target="#exampleModalLong">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>


    </table>

    <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
         aria-hidden="true">
        <form action="/employee" method="get">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <input hidden type="text" name="id" id="idStudent">
                        <p>Bạn có muốn xóa sình viên tên :<span id="nameStudent"></span></p>
                    </div>
                    <div class="modal-footer d-flex justify-content-around">
                        <button type="button" class="btn btn-success" data-dismiss="modal">Cancel</button>
                        <input type="hidden" name="action" value="delete">
                        <button type="submit" class="btn btn-danger ">Delete</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
    <br>

</div>
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"
        integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
        crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
        integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
        crossorigin="anonymous"></script>
<script>
    $(document).ready(function x() {
        $('#table').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        })
    });

    function sendDataToModal(id, name) {
        document.getElementById("idStudent").value = id;
        document.getElementById("nameStudent").innerText = name;
    }
</script>
</body>
</html>
