<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%
String message = (String) request.getAttribute("message");

%>

<h1>Login Page</h1>
<p>
<form action="./login.do" method="get">

<div>
<label>Username : </label>
<input type="text" name="username" />
</div>

<div>
<label>Password : </label>
<input type="text" name="password" />
</div>

<div>
<button type="submit">Login</button>
</div>

</form>
</p>
<p>
<%=message %>
</p>
</body>
</html>