<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Registration Form</title>
</head>
<body>
<h1>User Registration Form</h1>

<form:form method="POST" name="userModel" action="http://localhost:8080/GroupSpringProject/form/registration/addForm/">
    <table>
        <tr>
            <td>Name :</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Surname :</td>
            <td><form:input path="surname"/></td>
        </tr>
        <tr>
            <td>City :</td>
            <td><form:input path="city"/></td>
        </tr>
        <tr>
            <td>Years :</td>
            <td><form:input path="years"/></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" name="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
