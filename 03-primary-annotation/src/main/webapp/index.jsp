<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%--设置显示EL表达式--%>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/register.do" method="post" >
    <%--姓名：<input type="text" name="pname"/><br>--%>

    <%--整体接收时，要求表单参数名与对象属性名一致--%>
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    学校：<input type="text" name="school.sname"/><br>
    地址：<input type="text" name="school.address"/><br>
    <input type="submit" value="注册"/><br>
</form>
</body>
</html>
