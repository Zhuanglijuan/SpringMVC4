<%@page language="java" pageEncoding="utf-8" %>
<%--设置显示EL表达式--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                $.ajax({
                    url:"${pageContext.request.contextPath}/test/myAjax.do",
                    success:function (data) {
                        alert(data);
                    }
                });
            });
        });
    </script>
</head>
<body>
<button>提交ajax请求</button>
</body>
</html>
