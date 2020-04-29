<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
<c:forEach var="stu" items="${stus}">
    ${stu.stuId}---${stu.stuName}---${stu.stuPwd} <br/>
</c:forEach>
</body>
</html>
