<%@page import="com.nilam.product.entity.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Get Specific Data From Product :-</h1>
<br>
<%   Product p  = (Product)request.getAttribute("product");
if(p!=null){
%>
<h3>Product Name :: <%=p.getProductName() %></h3>
<h3>Product Category :: <%=p.getProductCategory() %></h3>
<h3>Product MfgDate :: <%=p.getMfgDate() %></h3>
<h3>Product ExpDate :: <%=p.getExpDate() %></h3>
<h3>Product Price :: <%=p.getProductPrice() %></h3>
<h3>Product Quantity :: <%=p.getProductQty() %></h3>
<%}
else{%>
<h2>No Product Found</h2>
<%} %>


</body>
</html>