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
    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/menu.js"></script>
</head>
<body>
<nav class="navbar" role="navigation" style="margin-bottom: 0">
    <div class="navbar-default sidebar" role="navigation">
        <ul class="nav nav-pills nav-stacked" style="margin-left: 15px; margin-right: 15px">
            <li>
                <a id="flip" class="dropdown-toggle" data-toggle="dropdown" role="button">
                    教学部 <span class="caret"></span>
                </a>
                <ul class="nav nav-pills nav-stacked" style="margin-left: 20px; margin-right: 20px" id="panel">
                    <li><a href="/teach" target="mainFrame">基本信息</a></li>
                    <li><a href="">个人资料</a></li>
                    <li><a href="">课程信息</a></li>
                </ul>
            </li>
            <li role="presentation"><a href="#">教质部</a></li>
            <li role="presentation"><a href="#">财务部</a></li>
            <li role="presentation"><a href="#">人事部</a></li>
            <li role="presentation"><a href="#">个人中心</a></li>
        </ul>
    </div>
</nav>
</body>
</html>
