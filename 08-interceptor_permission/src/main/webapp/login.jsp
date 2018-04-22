<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%--设置显示EL表达式--%>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    session.setAttribute("user","Zhuang");
%>
登录成功
</body>
</html>
