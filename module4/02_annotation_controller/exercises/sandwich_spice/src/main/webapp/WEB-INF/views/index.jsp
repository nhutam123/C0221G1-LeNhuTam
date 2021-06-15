<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 15/06/2021
  Time: 7:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    .container {
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .heading {
        color: red;
        margin: 40px auto;

    }

    form {
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

    .btn {
        background-color: #00afef;
        color: white;
        height: 38px;
        width: 120px;
        border-radius: 4px;
        border: 1px solid #aaaaaa;
      margin: 0 auto;

    }

    .btn:hover {
        background-color: #0d9ed3;
    }
    .box{
      font-size: 20px;
      color: red;
    }

    .container-input {
        display: flex;
        justify-content: space-around;

    }

    .input {
        height: 35px;
        min-width: 100px;
        padding-left: 10px;
        border: 1px solid #aaaaaa;
        border-radius: 5px;
        outline-color: #00afef;
    }

    .result {
        margin-left: 10px;
        color: #00afef;
    }

</style>
</head>
<body>
<div class="container">

    <form action="" method="post">
        <h1 class="heading">Sandwich Condiments</h1>
        <div class="container-btn">
            <input class="box" type="checkbox" name="calcul" value="Lettuce">Lettuce
            <input class="box" type="checkbox" name="calcul" value="Tomato">Tomato
            <input class="box" type="checkbox" name="calcul" value="Mustard">Mustard
            <input class="box" type="checkbox" name="calcul" value="Sprouts">Sprouts
        </div>
      <br>
      <br>
      <input class="btn" type="submit" value="save">
    </form>

</div>
</body>
</html>
