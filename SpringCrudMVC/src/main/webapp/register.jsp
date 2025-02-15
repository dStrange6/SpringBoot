<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Patient</title>
</head>
<body>
<div align="center">
    <h3>${newID}</h3>
<form method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <br>
    <br>
    <label for="age">Age:</label>
    <input type="number" id="age" name="age">
    <br>
    <br>
    <label for="gender">Gender:</label>
    <select name="gender" id="gender">
        <option value="male">Male</option>
        <option value="female">Female</option>
    </select>
    <br>
    <br>
    <input type="submit" value="Submit">
</form>
</div>
</body>
</html>
