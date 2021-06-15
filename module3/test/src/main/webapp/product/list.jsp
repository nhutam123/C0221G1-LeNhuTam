<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 9/06/2021
  Time: 8:35 AM
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
            height: 60px;
            width: 100%;
            background-image: linear-gradient(0,#0f83f5,#8cbcea);
            position: fixed;
            z-index: 1044;
            top: 0;
        }
        .content {
            margin-top: 85px;
        }
        #table {
            background-color: #77b5f1;
            border: 1px solid blue;
        }
        #search{
            border-radius: 10px;
            outline: none;
        }
        .logo{
            width: 100px;
        }
    </style>
</head>
<body>
<div id="header" class="header d-flex justify-content-between align-items-center ">
    <a href="/index.jsp">
        <div class="ml-3"><img class="logo" src="image/LOGOFurama_4C_Normal.png" alt=""></div>
    </a>
    <div class="mr-3">
        <button type="button" class="btn btn-danger" data-toggle="modal"
                data-target="#myModal">Sign up</button>
        <div class="modal" id="myModal" >
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-titel text-danger">Sign up</h4>
                        <button type="button" class="close" id="login" data-dismiss="modal">login</button>
                    </div>
                    <div class="modal-body">
                        <div class="d-flex justify-content-between mb-2">
                            <label> name</label>
                            <input type="text" class="w-75 search">
                        </div>
                        <div class="d-flex justify-content-between">
                            <label >password</label>
                            <input type="password" class="w-75 search">
                        </div>
                        <button type="submit" class="btn btn-success mt-3 float-lg-right" data-dismiss="modal">sign up</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div align="center" class="content container">
    <div class="d-flex justify-content-between">
        <h2 class="">
            <form method="get" action="/product">
                <input class="btn btn-success" type="submit" name="action" value="Create">
            </form>
        </h2>
        <form method="post" action="/product" class="">
            <input class="search p-1 " type="text" name="name" id="search">
            <input class="btn btn-success " type="submit" name="action" value="Search">
        </form>
    </div>
    <table border="2px" cellpadding="5" id="table" class="table  table-bordered ">
        <caption><a href="/product"><h2>List of Product</h2></a></caption>
        <thead>
        <tr>
            <th>STT</th>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Color</th>
            <th>Describe</th>
            <th>Edit</th>
            <th>Delete</th>


        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${listProduct}" varStatus="count">
            <tr>
                <td>${count.index+1}</td>
                <td><c:out value="${product.id}"/></td>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.color}"/></td>
                <td><c:out value="${product.describe}"/></td>

                <td>
                    <a href="/product?action=Edit&id=${product.id}">Edit</a>

                </td>
                <td>
                    <button type="button" class="btn btn-danger"
                            onclick="sendDataToModal('${product.id}','${product.name}')" data-toggle="modal"
                            data-target="#exampleModalLong">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

     <%--    modal--%>

    <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
         aria-hidden="true">
        <form action="/product" method="get">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header d-flex justify-content-center">
                        <h5 class="modal-title text-danger" id="exampleModalLongTitle">Delete</h5>
                    </div>
                    <div class="modal-body">
                        <input hidden type="text" name="id" id="idStudent">
                        <p>Bạn có muốn xóa sình viên tên : <span class="text-danger " id="nameStudent"></span></p>
                    </div>
                    <div class="modal-footer d-flex justify-content-around">
                        <button type="button" class="btn btn-success" data-dismiss="modal">Cancel</button>
                        <input type="hidden" name="action" value="Delete">
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
            "pageLength": 4
        })
    });

    function sendDataToModal(id, name) {
        document.getElementById("idStudent").value = id;
        document.getElementById("nameStudent").innerText = name;
    }
</script>
</body>
</html>
