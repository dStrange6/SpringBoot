<%--
  Created by IntelliJ IDEA.
  User: pmayank
  Date: 16/02/25
  Time: 6:24 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<div align="center">--%>
<%--  <form method="post" action="http://localhost:8080/update">--%>

<%--    <input type="hidden" id="id" name="id" value="${patient.id}" >--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <label for="name">Name:</label>--%>
<%--    <input type="text" id="name" name="name" value="${patient.name}"><br>--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <label for="age">Age:</label>--%>
<%--    <input type="number" id="age" name="age" value="${patient.age}"><br>--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <label for="gender">Gender:</label>--%>
<%--    <select name="gender" id="gender">--%>
<%--      <option value="male" ${patient.gender == 'male' ? 'selected' : ''}>Male</option>--%>
<%--      <option value="female" ${patient.gender == 'female' ? 'selected' : ''}>Female</option>--%>
<%--    </select>--%>
<%--    <br>--%>
<%--    <br>--%>
<%--    <input type="submit" value="Submit">--%>
<%--  </form>--%>
<%--</div>--%>

<%--Below is an example of same form as above but using spring tag library, thus simplifying sytnax and giving bi-directional binding--%>
<form:form modelAttribute="patient" action="http://localhost:8080/update" method="post">
  <form:hidden path="id" />

  <label for="name">Name:</label>
  <form:input path="name" />

  <br><br>

  <label for="age">Age:</label>
  <form:input path="age" type="number" />

  <br><br>

  <label for="gender">Gender:</label>
  <form:select path="gender">
    <form:option value="male">Male</form:option>
    <form:option value="female">Female</form:option>
  </form:select>

  <br><br>

  <input type="submit" value="Submit">
</form:form>

</body>
</html>
