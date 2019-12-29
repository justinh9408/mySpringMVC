<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pojo</title>
</head>
<body>
    <h1>This is POJO</h1>

    <form:form action = "user" method='POST' modelAttribute="user">
        Name: <form:input path="name"/>
        <form:errors path="name"/>
        <br>
        email: <form:input path = 'email'/>
        <form:errors path="email"/>
        <br>
        age: <form:input path = 'age'/>
        <form:errors path="age"/>
        <br>
        password: <form:input path = 'password'/>
        <form:errors path="password"/>
        <br>
        birth: <form:input path = 'birth'/>
        <form:errors path="birth"/>
        <br>
        city: <form:input path = 'address.city'/>
        <form:errors path="address.city"/>

        <br>
        province: <form:input path = 'address.province'/>
        <form:errors path="address.province"/>
        <br>
        <input type='submit' value='Submit!'/>
    </form:form>
    <br>

</body>
</html>
