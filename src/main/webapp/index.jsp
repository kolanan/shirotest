<%--
  Created by IntelliJ IDEA.
  User: konan
  Date: 2018/3/28
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/login.do" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    <input type="submit" value="登录">${error}

</body>
</html>
