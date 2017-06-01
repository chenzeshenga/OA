<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/1
  Time: 上午 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%> <!--数据格式化标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <!--数据库相关标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <!--常用函数标签库-->
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <script src="js/jquery-3.1.1.min.js"/>
    <script src="js/bootstrap.js"></script>
</head>
<frameset rows="103,*,43" frameborder=0 border="0" framespacing="0">
    <frame src="" name="topFrame" scrolling="NO" noresize>
    <frameset cols="159,*" frameborder="0" border="0" framespacing="0">
        <frame src="/menu" name="leftFrame" noresize scrolling="YES">
        <frame src="" name="mainFrame">
    </frameset>
    <frame src="" name="bottomFrame" scrolling="NO"  noresize>
</frameset>
</html>

