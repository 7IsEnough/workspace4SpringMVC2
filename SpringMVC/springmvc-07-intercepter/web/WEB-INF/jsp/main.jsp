<%--
  Created by IntelliJ IDEA.
  User: 陈振寰
  Date: 2024/3/3
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>首页</h1>

<span>${username}</span>

<p>
    <a href="${pageContext.request.contextPath}/user/logout">注销</a>
</p>

</body>
</html>
