<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 9/06/2021
  Time: 8:36 AM
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
        #table {
            border: 1px #0f83f5;
            background-color: #74b1ec;
            color: #e62a44;
        }
        .logo{
            width: 100px;
        }
        .content {
            margin-top: 85px;
        }
    </style>
</head>
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

<div align="center" class="container content">
    <form method="post" action="/product">
        <table id="table" border="1" cellpadding="5" class="table table-dark table-striped table-bordered">
            <caption>
                <h2>
                    Create Product
                </h2>
            </caption>
            <c:if test="${product != null}">
                <input class="form-control" type="hidden" name="id" value="<c:out value="${product.id}"/>"/>
            </c:if>

            <tr>
                <th>Product Name:</th>
                <td>
                    <input class="form-control" type="text" name="name" size="45"
                           value="<c:out value='${product.name}' />"
                    />
                    <p style="color: red"><c:out value="${message}"/></p>
                </td>
            </tr>
            <tr>
                <th>Product price:</th>
                <td>
                    <input class="form-control" type="text" name="price" size="45"
                           value="<c:out value='${product.price}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Product color:</th>
                <td>
                    <input class="form-control" type="text" name="color" size="45"
                           value="<c:out value='${product.color}' />"/>
                </td>
            </tr>
            <tr>
                <th>Product describe:</th>
                <td>
                    <input class="form-control" type="text" name="describe" size="45"
                           value="<c:out value='${product.describe}' />"
                    />
                </td>
            </tr>
<%--            <tr>--%>
<%--                <th>User Email:</th>--%>
<%--                <td>--%>
<%--                    <input class="form-control" type="text" name="email" size="45"--%>
<%--                           value="<c:out value='${customer.email}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>address:</th>--%>
<%--                <td>--%>
<%--                    <input class="form-control" type="text" name="address" size="45"--%>
<%--                           value="<c:out value='${customer.address}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
            <tr>
                <td colspan="2" align="center">
                    <input class="btn btn-danger" type="submit" name="action"  value="Create"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>

