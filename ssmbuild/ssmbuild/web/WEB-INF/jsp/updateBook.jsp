<%--
  Created by IntelliJ IDEA.
  User: 陈振寰
  Date: 2024/3/3
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--BookStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clear-fix" >
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>


    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">

        <%--前端传递隐藏域--%>
        <input type="hidden" name="bookID" value="${QBooks.bookID}">

        <div class="form-group">
            <label for="bookName">书籍名称：</label>
            <input type="text" name="bookName" class="form-control" id="bookName" value="${QBooks.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCount">书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control" id="bookCount" value="${QBooks.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述：</label>
            <input type="text" name="detail" class="form-control" id="detail" value="${QBooks.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>



</div>

</body>
</html>
