<%--
  Created by IntelliJ IDEA.
  User: chenyuming
  Date: 2017/3/31
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>--%>
<!-- Bootstrap Core CSS -->
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() +
            ":" + request.getServerPort() + path + "/";
%>
<link href="<%=basePath%>common/css/bootstrap.min.css" rel="stylesheet">
