<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<% int id = (Integer) request.getAttribute("id"); %>
<h1> Do you want to delete?</h1>
<form>
<input type="hidden" name="id" value="<%=id %>">
<button type="submit" formaction="delete" formmethod="post">Yes</button>

<button type="submit" formaction="list">No</button>

</form>
</div>
</body>
</html>