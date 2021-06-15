<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 4/06/2021
  Time: 11:42 AM
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
        #table{
            border: 1px solid chartreuse;
        }
        th {
            color: blue;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>Employee Management</h1>
    <h2>
        <a href="employee?action=employee">List All Employee</a>
    </h2>
</div>

<div align="center">
    <form method="post" action="/employee">
        <table id="table" border="1" cellpadding="5" class="table table-striped table-bordered">
            <caption>
                <h2>
                    Edit Employee
                </h2>
            </caption>
            <c:if test="${employee != null}">
                <input type="hidden" name="id" value="<c:out value='${employee.id}' />"/>
            </c:if>

            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${employee.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>degree</th>
                <td>
                    <select name="degree" id="degree">
                        <c:forEach var="degree" items="${listDegree}">
                            <option value="${degree.id}"  ${degree.id==employee.degree.id?"selected":""}>${degree.degree}</option>

                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>department</th>
                <td>
                    <select name="department" id="department">
                      <c:forEach var="department" items="${listDepartment}">
                          <option value="${department.id}" ${department.id==employee.department.id?"selected":""}>${department.department}</option>
                      </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <select name="position" id="position">
                        <c:forEach var="position" items="${listPosition}">
                            <option value="${position.id}" ${position.id==employee.position.id?"selected":""} >${position.position}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>User birthday:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${employee.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User phoneNumber:</th>
                <td>
                    <input type="text" name="phoneNumber" size="45"
                           value="<c:out value='${employee.phoneNumber}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User card:</th>
                <td>
                    <input type="text" name="card" size="45"
                           value="<c:out value='${employee.card}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${employee.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" size="45"
                           value="<c:out value='${employee.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="action"  value="edit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
