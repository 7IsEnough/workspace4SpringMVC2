<%--
  Created by IntelliJ IDEA.
  User: 陈振寰
  Date: 2024/2/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/hello" method="post">
    <input type="text" name="method">
    <input type="submit">
</form>

</body>
</html>
