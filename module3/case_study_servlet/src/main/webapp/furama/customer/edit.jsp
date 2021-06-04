<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 2/06/2021
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
  <jsp:include page="commond/style.jsp"/>
</head>
<body>
<div class="header">
    <h1>User Management</h1>
    <h2>
        <a href="customer?action=customer">List All Users</a>
    </h2>
</div>

<div align="center">
    <form method="post" action="">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Customer
                </h2>
            </caption>
            <c:if test="${customer != null}">
                <input type="hidden" name="id" value="<c:out value='${customer.id}' />"/>
            </c:if>
<%--            <tr>--%>
<%--                <th>User  id:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="id" size="45"--%>
<%--                           value="<c:out value='${customer.id}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
            <tr>
                <th>User type id:</th>
                <td>
                    <input type="text" name="typeId" size="45"
                           value="<c:out value='${customer.customerTypeId}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${customer.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User birthday:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${customer.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User phoneNumber:</th>
                <td>
                    <input type="text" name="phoneNumber" size="45"
                           value="<c:out value='${customer.phoneNumber}' />"/>
                </td>
            </tr>
            <tr>
                <th>User card:</th>
                <td>
                    <input type="text" name="card" size="45"
                           value="<c:out value='${customer.card}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${customer.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" size="45"
                           value="<c:out value='${customer.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit"  value="edit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
