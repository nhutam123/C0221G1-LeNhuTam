<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 2/06/2021
  Time: 9:01 PM
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
    <h1>Employee Management</h1>
    <h2>
        <a href="/employee?action=employee">List All Employee</a>
    </h2>
</div>


<div align="center">
    <form method="post" action="/employee">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Eployee</h2>
            </caption>

            <tr>
                <th>employee Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>degree</th>
                <td>
                    <select name="degree" id="degree">
                        <option value="1">trung cap</option>
                        <option value="2">cao dang</option>
                        <option value="3">dai hoc</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>department</th>
                <td>
                    <select name="department" id="department">
                        <option value="1">Sale-Marketing</option>
                        <option value="2">Hành Chính</option>
                        <option value="3">Phục vụ</option>
                        <option value="4">Quản lý</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <select name="position" id="position">
                        <option value="1">le tan</option>
                        <option value="2">phuc vu</option>
                        <option value="3">chuyen vien</option>
                        <option value="4">giam sat</option>
                        <option value="5">quan ly</option>
                        <option value="6">giam doc</option>
                    </select>
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
                <td colspan="2" align="center">
                    <input type="submit" name="action" value="create"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
