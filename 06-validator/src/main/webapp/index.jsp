<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%--设置显示EL表达式--%>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/register.do" method="post">
    姓名：<input type="text" name="name"/>${nameErrorMSG}<br>
    成绩：<input type="text" value="0" name="score"/>${scoreErrorMSG}<br>
    电话：<input type="text" name="mobile"/>${mobileErrorMSG}<br>
    <input type="submit" value="注册"/><br>
</form>
</body>
</html>
