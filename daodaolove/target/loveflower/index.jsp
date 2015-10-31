<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>欢迎</title>
</head>
<body>
<h2>Hello World!</h2>

<form method="post" action="login">
    <label for="username">用户名：</label>
    <input id="username" name="username" type="text"/>
    <br><br>
    <label for="password">密&nbsp;码：</label>
    <input id="password" name="password" type="password"/><br>
    <input type="submit" value="登录">
</form>
<span>当前IP：<%=request.getRemoteAddr() %></span>
</body>
</html> 