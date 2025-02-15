
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users Page</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    ${user.id}<br>
    ${user.name}<br>
    ${user.email}<br>
    <br>
</c:forEach>
</body>
</html>
