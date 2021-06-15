<%--
  Created by IntelliJ IDEA.
  User: LE NHU TAN
  Date: 9/06/2021
  Time: 8:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Employee</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css">
    <style>
      #header {
        height: 60px;
        width: 100%;
        background-image: linear-gradient(0,#0f83f5,#8cbcea);
        position: fixed;
        z-index: 1044;
        top: 0;
      }
      #myModal{

      }
      #main {
        margin-top: 80px;

      }

      .search{
        border-radius: 10px;
      }
      .search-img {
        width: 30px;
      }
      .content {
        min-height: 500px;
      }
      .item {
        background-color: white;
      }
      .logo{
        width: 100px;
      }
      .content-img {
        width: 100%;
      }
      a{
        margin: 0;
        padding: 0;
      }
      .img-slider {
        width: 50%;
      }
      .footer {
        background-color: #77b5f1;
      }
      #left-main {
        background-color: #dae0e2;
        color: green;
        font-size: 30px;
      }
      .item-left {
        color: red;
        font-size: 20px;
        margin: 15px 0;
      }
      .nav-link {
        font-size: 20px;
        color: red;
        font-weight: bold;
        background-color: #b3d2f0;
        margin: 0 2px;
      }
      .nav-header{
        margin-left: 15px;
      }

      @media screen and (max-width: 739px){
        .nav-header {
          display: none;
        }
        #main {
          justify-content: center!important;
        }
      }
    </style>
  </head>
  <body>

    <%--  header--%>

  <div id="header" class="header d-flex justify-content-between align-items-center ">
    <a href="#">
      <div class="ml-3"><img class="logo" src="image/LOGOFurama_4C_Normal.png" alt=""></div>
    </a>
    <div class="mr-3">
      <button type="button" class="btn btn-danger" data-toggle="modal"
              data-target="#myModal">Sign up</button>

      </div>
    </div>
  </div>

  <div id="slider">

  </div>

    <%--    navbar--%>

  <div id="main" class="d-flex justify-content-between">
    <ul class="nav-header nav nav-tabs">
      <li class="nav-item">
        <a href="" class="nav-link">Home</a>
      </li>
      <li class="nav-item">
        <a href="/product" class="nav-link">Category</a>
      </li>
      <li class="nav-item">
        <a href="/product" class="nav-link">Product</a>
      </li>
    </ul>
    <form action="" class="mr-3">
      <div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="Search" aria-label="Recipient's username" aria-describedby="basic-addon2">
        <div class="input-group-append">
          <button class="btn btn-outline-secondary" type="button"><img class="search-img" src="./image/search.png" alt=""></button>
        </div>
      </div>
    </form>
  </div>

       <%--    content--%>

  <div  class="row content container-fluid">
    <div  class="row mh-100 ml-3">

     <%--      left content--%>

      <div id="left-main" class="col col-lg-3 col-sm-0 bg-light d-flex flex-column ">Menu
        <a class="item-left" href="/customer_type">Customer type</a>
        <a class="item-left" href="">Item two</a>
        <a class="item-left" href="">Item three</a>
      </div>

     <%--  right content--%>

      <div class="col col-lg-9 col-sm-12 ">
        <div class="row">
          <div class="item col col-lg-4 col-sm-12 col-md-6 bg-light">
            <a class="" href="furama/service/villa/list.jsp">
              <img class="content-img" src="./image/villa.webp" alt="">
              <h3>villa</h3>
              <p>villa đẹp nhất Đông Nam Á</p>
            </a>
          </div>

          <div class="item col col-lg-4 col-sm-12 col-md-6 bg-light">
            <a class="" href="furama/service/room/list.jsp">
              <img class="content-img" src="./image/room.webp" alt="">
              <h3>Room</h3>
              <p>Room đẹp nhất Đông Nam Á</p>
            </a>
          </div>
          <div class="item col col-lg-4 col-sm-12 col-md-6 bg-light">
            <a class="" href="./furama/service/house/list.jsp">
              <img class="content-img" src="./image/house.webp" alt="">
              <h3>House</h3>
              <p>House đẹp nhất Đông Nam Á</p>
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>

     <%--    footer--%>

  <div class=" row d-flex align-items-center justify-content-center footer " style="background-color: dodgerblue ;color: white" >
    footer
  </div>
    <div class="modal" id="myModal">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-titel text-danger">Sign up</h4>
            <button type="button" class="close" id="login" data-dismiss="modal">login</button>
          </div>
          <div class="modal-body">
            <div class="d-flex justify-content-between mb-2">
              <label> name</label>
              <input type="text" class="w-75 search">
            </div>
            <div class="d-flex justify-content-between">
              <label >password</label>
              <input type="password" class="w-75 search">
            </div>
            <button type="submit" class="btn btn-success mt-3 float-lg-right" data-dismiss="modal">sign up</button>
          </div>
        </div>

      </div>
    </div>


    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>

  </body>
</html>
