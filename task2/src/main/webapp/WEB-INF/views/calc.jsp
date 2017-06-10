<%--
  Created by IntelliJ IDEA.
  User: VladislavTitov
  Date: 08.06.2017
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Calc</title>
</head>
<body>
<form:form method="post" modelAttribute="exp" action="execute">
    <form:input path="first"/>
    <form:input path="second"/>
    <form:select path="operator">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </form:select>
    <input type="submit"/>
</form:form>

</body>
</html>
