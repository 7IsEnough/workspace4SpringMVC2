<%--
  Created by IntelliJ IDEA.
  User: 陈振寰
  Date: 2024/3/3
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.7.0.min.js">

    </script>

    <script>
      function a() {
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success: function (data, status) {
            console.log("data", data);
            console.log("status", status);
          },
          error: function () {

          }
      });
      }
    </script>

  </head>
  <body>

  <%--失去焦点的时候，发起一个请求到后台--%>
  用户名：<input type="text" id="username" onblur="a()">

  </body>
</html>
