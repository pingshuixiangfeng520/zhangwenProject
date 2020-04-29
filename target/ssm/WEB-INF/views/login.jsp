<%@ page isELIgnored="false" language="java" isErrorPage="true"  import="java.util.*" pageEncoding="UTF-8"  contentType="text/html;charset=UTF-8"  %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html >
<body>
<h2>Hello World!</h2>


<a href="stu/findStudent">查询所有学生</a>
</body>
</html>
