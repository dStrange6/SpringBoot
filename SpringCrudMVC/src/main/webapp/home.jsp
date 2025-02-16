<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Patient Home Page</title>
</head>
<body>
<table align="center" cellspacing="20">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Update User</th>
        <th>Delete User</th>
    </tr>
        <c:forEach items="${patients}" var="patient">
    <tr>
            <td>${patient.id}</td>
            <td>${patient.name}</td>
            <td>${patient.age}</td>
            <td>${patient.gender}</td>
            <td><a href="update/${patient.id}">update</a></td>
            <td><a href="delete/${patient.id}">delete</a></td>
    </tr>
        </c:forEach>

</table>
<br>
<a href="register">Register New User</a>

</body>
</html>
