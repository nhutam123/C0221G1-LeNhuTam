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
    <h1>Product Management</h1>
    <h2>
        <a href="/product?action=customer">List All Product</a>
    </h2>
</div>

<div align="center" class="container">
    <form method="post" action="/product">
        <table id="table" border="1" cellpadding="5" class="table table-dark table-striped table-bordered">
            <caption>
                <h2>
                    Edit Product
                </h2>
            </caption>
            <c:if test="${product != null}">
                <input class="form-control" type="hidden" name="id" value="<c:out value='${product.id}' />"/>
            </c:if>

            <tr>
                <th>Product Name:</th>
                <td>
                    <input class="form-control" type="text" name="name" size="45"
                           value="<c:out value='${product.name}' />"
                    />
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
                           value="<c:out value='${product.color}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Product Price:</th>
                <td>
                    <input class="form-control" type="text" name="describe" size="45"
                           value="<c:out value='${product.describe}' />"
                    />
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input class="btn btn-danger" type="submit" name="action"  value="Edit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>