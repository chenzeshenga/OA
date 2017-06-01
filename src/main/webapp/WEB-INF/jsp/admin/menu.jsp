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
    <title>主页</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>

    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
    <div class="col-sm-3 col-md-2 sidebar">
        <ul class="nav nav-pills nav-stacked">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" data-target="/teach" role="button" aria-haspopup="true" aria-expanded="false">
                    教学部 <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="">教质部</a></li>
                    <li><a href="#">财务部</a></li>
                    <li><a href="#">人事部</a></li>
                </ul>
            </li>
            <li role="presentation"><a href="/teach" target="mainFrame">教学部</a></li>
            <li role="presentation"><a href="">教质部</a></li>
            <li role="presentation"><a href="#">财务部</a></li>
            <li role="presentation"><a href="#">人事部</a></li>
            <li role="presentation"><a href="#">个人中心</a></li>
        </ul>
    </div>
</body>
</html>
