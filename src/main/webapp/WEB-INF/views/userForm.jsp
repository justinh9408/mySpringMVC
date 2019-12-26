<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pojo</title>
</head>
<body>
    <h1>This is POJO</h1>

    <form method='POST'>
        name: <input type='text' name = 'name'></input>
        <br>
        email: <input type='text' name = 'email'></input>
        <br>
        age: <input type='text' name = 'age'></input>
        <br>
        city: <input type='text' name = 'address.city'></input>
        <br>
        province: <input type='text' name = 'address.province'></input>
        <br>
        <input type='submit' value='Submit!'/>
    </form>
    <br>

</body>
</html>
