<%--
  Created by IntelliJ IDEA.
  User: pmayank
  Date: 07/02/25
  Time: 6:52 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User HomePage</title>
</head>
<body>
<h1>${user}</h1>   <%--user.toString() will be done internally--%>
<h2>${user.age}</h2>     <%--user.getAge() will be done internally --%>
<%--JSP Expression Language(EL) used the mechanism, known as bean introspection, allows JSP to access private properties indirectly via their public getter methods.--%>
</body>
</html>
