<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello</title>
</head>
<body>
    <h1>This is Hello</h1>
    timeAtrr: ${requestScope.timeAtrr}
    <br>
    time: ${requestScope.time}
    <br>
    address requestScope: ${requestScope.address}
    <br>
    address sessionScope: ${sessionScope.address}
    <br>

</body>
</html>
