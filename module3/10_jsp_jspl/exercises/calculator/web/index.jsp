<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 27/05/2021
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple calculator</h1>
  <form action="/calculator">
    <input type="text" placeholder="first number" name="firstNumber">
    <br>
    <select name="option" id="">
      <option value="cong">cong</option>
      <option value="tru">tru</option>
      <option value="nhan">nhan</option>
    </select>
    <br>
    <input type="text" placeholder="second number" name="secondNumber">
    <br>
    <input type="submit" name="submit">


  </form>

  </body>
</html>
