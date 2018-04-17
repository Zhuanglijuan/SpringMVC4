<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%--设置显示EL表达式--%>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/test/upload.do" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="img"/><br>
    <input type="submit" value="上传"/><br>
</form>
</body>
</html>
