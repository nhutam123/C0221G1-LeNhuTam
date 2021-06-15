<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 12/06/2021
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Converter</title>
    <style>
      .container{
        display: flex;
        justify-content: center;
        align-items: center;
      }
      .heading{
        color: red;
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
      .btn{
        background-color: #00afef;
        color: white;
        height: 38px;
        min-width: 80px;
        border-radius: 4px;
        border: 1px solid #aaaaaa;
      }
      .input{
        height: 35px;
        min-width: 200px;
        padding-left: 10px;
        border: 1px solid #aaaaaa;
        border-radius: 5px;
        outline-color: #00afef;
      }
      .text {
        font-size: 20px;
        color: red;
      }
      .content{
        margin-left: 20px;
      }

    </style>
  </head>
  <body>
  <div class="container">
    <form action="/converter">
      <div class="content">
        <h2 class="heading">Currency</h2>
        <div class="input-btn">
          <input type="text" class="input" name="USD">
          <input type="submit" class="btn" value="converter">
        </div>
        <p class="text">Result : <c:out>${vnd}</c:out></p>
      </div>
    </form>
  </div>
  </body>
</html>
