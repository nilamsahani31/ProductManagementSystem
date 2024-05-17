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
<h1>Product Management System Project !!!</h1>
<%
out.println("-------------------------------------------------------------------------------------------------------------------");
%>
<h2>Product Details :-</h2>
<form action="Save" method="post">
<h3>Enter Product Name :: <input type="text" name="productName"></h3><br> 
<h3>Enter Product Category :: <input type="text" name="productCategory"></h3><br> 
<h3>Enter Product MfgDate :: <input type="text" name="mfgDate"></h3><br> 
<h3>Enter Product ExpDate :: <input type="text" name="expDate"></h3><br> 
<h3>Enter Product Price :: <input type="text" name="productPrice"></h3><br> 
<h3>Enter Product Quantity :: <input type="text" name="productQty"></h3><br>
<h3><input type="submit" value="AddProduct +"></h3>
</form>
</div>
</body>
</html>