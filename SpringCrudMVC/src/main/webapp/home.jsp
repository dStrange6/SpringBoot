<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Patient Home Page</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Age</td>
        <td>Gender</td>
    </tr>
        <c:forEach items="${patients}" var="patient">
    <tr>
            <td>${patient.id}</td>
            <td>${patient.name}</td>
            <td>${patient.age}</td>
            <td>${patient.gender}</td>

    </tr>
        </c:forEach>

</table>
<br>
<a href="register">Register New User</a>

</body>
</html>
