<%--
  Created by IntelliJ IDEA.
  User: bran
  Date: 2017/6/5
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/doLogin" method="post">
    <p>
        <label for="username">用户名</label>
        <input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="password">密码</label>
        <input type="password" id="password" name="password"/>
    </p>
    <p>
        <label for="userType">用户类型</label>
        <input id="userType" type="text" name="userType"/>
    </p>
    <p>
        <input type="submit" value="确定"/>
    </p>
</form>
</body>
</html>
