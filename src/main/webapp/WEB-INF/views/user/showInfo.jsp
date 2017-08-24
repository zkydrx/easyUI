<%--
  Created by IntelliJ IDEA.
  User: zkydr
  Date: 2017-08-23
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    String path = request.getContextPath();
    String basePath=request.getScheme()+"://"+
    request.getServerName()+":"+request.getServerPort()+
    path+"/";

%>



<html>
<head>
    <base href="<%=basePath%>"/>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <script type="text/javascript" src="../../../js/jquery-3.2.1.min.js"/>
    <script type="text/javascript">

    </script>
    <title>用户信息</title>
</head>
<body>
<table>
    <tr><td>用户ID:</td><td>${userInfo.id}</td></tr>
    <tr><td>用户名称:</td><td>${userInfo.nickName}</td></tr>
    <tr><td>用户手机:</td><td>${userInfo.telephone}</td></tr>
    <tr><td>用户注册时间:</td><td><fmt:formatDate value="${userInfo.registerDate}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td></tr>
</table>
</body>
</html>
