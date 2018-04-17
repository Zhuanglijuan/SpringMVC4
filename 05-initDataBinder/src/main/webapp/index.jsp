<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%--设置显示EL表达式--%>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/register.do" method="post">
    年龄：<input type="text" name="age"/><br>
    生日：<input type="text" name="birthday"/><br>
    <input type="submit" value="注册"/><br>
</form>
</body>
</html>
