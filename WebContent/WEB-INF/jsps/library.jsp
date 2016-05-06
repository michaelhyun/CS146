<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCH RESULTS</title>
</head>
<body>
   
<table border=1> 
<tr>
	<th>Title</th>
	<th>Author</th>
	<th>ISBN</th>
</tr>
<%
	String message = (String) request.getAttribute("message");
	edu.sjsu.p146.service.Book[] books = (edu.sjsu.p146.service.Book[]) request.getAttribute("books");
	
	for(edu.sjsu.p146.service.Book book : books) {
%>
	<tr>
		<td><%= book.getTitle() %></td>
		<td><%= book.getAuthor() %></td>
		<td><%= book.getISBN() %></td>
	</tr>
<%
	}
%>
</table>


</body>
</html>