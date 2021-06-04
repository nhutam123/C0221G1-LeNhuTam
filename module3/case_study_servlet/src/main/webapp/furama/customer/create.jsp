<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 2/06/2021
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .header {
            text-align: center;
            color: orange;
            background-color: bisque;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>User Management</h1>
    <h2>
        <a href="/customer?action=customer">List All Users</a>
    </h2>
</div>


<div align="center">
    <form method="post" action="/customer">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New User</h2>
            </caption>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>birthday:</th>
                <td>
                    <input type="date" name="birthday" id="birthday" size="45"/>
                </td>
            </tr>
            <tr>
                <th>card:</th>
                <td>
                    <input type="text" name="card" id="card" size="45"/>
                </td>
            </tr>
            <tr>
                <th>phone number:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="45"/>
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" id="address" size="45"/>
                </td>
            </tr>
            <tr>
                <th>id loại khach:</th>
                <td>
                    <select name="type_id" id="type_id">
                        <option value="1">diamond</option>
                        <option value="2">platinium</option>
                        <option value="3">gold</option>
                        <option value="4">silver</option>
                        <option value="5">member</option>
                    </select>

                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="action" value="create"/>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
