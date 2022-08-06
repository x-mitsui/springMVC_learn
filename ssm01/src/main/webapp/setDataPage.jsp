<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/8/6
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作用域传参</title>
</head>
<body>
    <%--域中的数据--%>
    requestScope :message:${requestScope.message} ,uname:${requestScope.users[0].uname} <br/>
    sessionScope :message:${sessionScope.message} ,uname:${sessionScope.users[0].uname} <br/>
    applicationScope :message:${applicationScope.message} ,uname:${applicationScope.users[0].uname} <br/>
    <%--请求参数--%>
    requestParam:${param.message}
</body>
</html>
