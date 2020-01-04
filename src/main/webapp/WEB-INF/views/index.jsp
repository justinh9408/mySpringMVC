<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
    <h1>This is SpringMVC</h1>

    <a href='ssm/emp/3'>test SSM emp</a><br>


    <a href='test01/testExcptionHandler?i=2'>test Excption Handler</a><br>


    <form method="POST" action="uploadFile" enctype="multipart/form-data">
            File to upload: <input type="file" name="file">
        <input type="submit" value="Upload"> Press here to upload the file!
    </form>

    <a href='test01/testSessionAttr'>test SessionAttr</a><br>

    <a href='test01/testModelAndView'>test ModelAndView</a><br>

    <a href='pojo/user'>go to user form</a><br>


    <a href='test01/testCookieValue'>Test testCookieValue</a><br>

    <a href='test01/testRequestParam?name=hjc&age=11'>Test RequestParam</a><br>


    <form action='test01/testRest' method="POST">
        <input type='submit' value='testRest post'></input>
    </form><br>

    <form action='test01/testRest/1' method="POST">
        <input type='hidden' name='_method'/ value='delete'>
        <input type='submit' value='testRest dele'></input>
    </form><br><br>

    <form action='test01/testRest/2' method="POST">
        <input type='hidden' name='_method'/ value='put'>
        <input type='submit' value='testRest put'></input>
    </form><br>
    <a href='test01/testRest/1'>Test rest get</a><br>


    <a href='test01/testPathVariable/1'>Test PathVariable</a><br>
    <a href='test01/lalal/ant'>Ant Path</a><br>
    <a href='hello'>hello</a><br>
    <a href='test01/ctlmap'>test controler Mapping</a><br>
    <a href='test01/testParamAndHeader?age=10'>test testParamAndHeader</a><br>
    <a href='test01/testParamAndHeader1?age=11'>test testParamAndHeader 1</a><br>
    <form action='test01/testMethod' method="POST">
        <input type='submit' value='submit'></input>
    </form>

</body>
</html>
