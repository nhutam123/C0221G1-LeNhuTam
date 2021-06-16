<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 15/06/2021
  Time: 7:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
    <style>
      .container{
        display: flex;
        justify-content: center;
        align-items: center;
      }
      .heading{
        color: red;
        margin:30px auto;
      }
      form{
        border: 1px solid #aaaaaa;
        border-radius: 5px;
        width: 400px;
        height: 300px;
        margin-top: 100px;
        display: flex;
        flex-direction: column;
        background-color: #f4f4f4;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.1), 0 6px 20px 0 rgba(0, 0, 0, 0.1);

      }
      .container-btn {
        display: flex;
        justify-content: space-around;
      }
      .btn{
        background-color: #555555;
        color: white;
        height: 38px;
        min-width: 80px;
        border-radius: 4px;
        border: 1px solid #aaaaaa;

      }
      .btn:hover {
        background-color: #0d9ed3;
      }
      .container-input{
        display: flex;
        justify-content: space-around;

      }
      .input{
        height: 35px;
        min-width: 100px;
        padding-left: 10px;
        border: 1px solid #aaaaaa;
        border-radius: 5px;
        outline-color: #00afef;
      }

      .result{
        margin-left: 10px;
        color: #00afef;
      }

    </style>
  </head>
  <body>
  <div class="container">

    <form action="/calculator" method="post">
      <h1 class="heading">Calculator</h1>
      <div class="container-input">
        <input class="input" type="text" name="number1" value="${number1}">
        <input class="input" type="text" name="number2" value="${number2}">
      </div>
      <p class="result">Result : ${result}</p>
      <br>
      <br>
      <div class="container-btn">
        <input class="btn" type="submit" name="calcul" value="cong">
        <input class="btn" type="submit" name="calcul" value="tru">
        <input class="btn" type="submit" name="calcul" value="nhan">
        <input class="btn" type="submit" name="calcul" value="chia">
      </div>

    </form>
  </div>
  </body>
</html>
