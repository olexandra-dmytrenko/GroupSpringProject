<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page %>

<html>
<body>

    <h1>Registration Form</h1>

    <form:form method="POST" commandName="user" action="http://localhost:8080/GroupSpringProject/login/user">
        <br><form:errors path="name" cssStyle="color: red"/><br/>
        Name: <br /> <form:input path="name"/> <br/>
        <br><form:errors path="password" cssStyle="color: red"/><br/>
        Password: <br /> <form:input path="password"/> <br/>
        <br><form:errors path="email" cssStyle="color: red"/><br/>
        E-mail: <br /> <form:input path="email"/> <br/> <br>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>