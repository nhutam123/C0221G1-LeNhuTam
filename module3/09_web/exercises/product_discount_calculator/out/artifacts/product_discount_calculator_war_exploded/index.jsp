<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 26/05/2021
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>product discount calculator</h2>
  <form action="/discount" method="post">
    <input type="text" name="product" placeholder="product name">
    <input type="text" name="listPrice" placeholder="list price">
    <input type="text" name="discount" placeholder="discount percen">
    <input type="submit" value="calculate">
  </form>

  </body>
</html>
