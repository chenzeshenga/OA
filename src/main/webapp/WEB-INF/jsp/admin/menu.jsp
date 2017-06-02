<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/1
  Time: 上午 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>

    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/menu.js"></script>
</head>
<body>
<div class="col-sm-3 col-md-2 sidebar">
    <ul class="nav nav-pills nav-stacked">
        <li id="flip">
            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                教学部 <span class="caret"></span>
            </a>
            <ul class="nav nav-pills nav-stacked" style="margin-left: 10px" id="panel">
                <li><a href="">基本信息</a></li>
                <li><a href="">个人资料</a></li>
                <li><a href="">课程信息</a></li>
            </ul>
        </li>
        <li role="presentation"><a href="">教质部</a></li>
        <li role="presentation"><a href="#">财务部</a></li>
        <li role="presentation"><a href="#">人事部</a></li>
        <li role="presentation"><a href="#">个人中心</a></li>
    </ul>
</div>
</body>
</html>
