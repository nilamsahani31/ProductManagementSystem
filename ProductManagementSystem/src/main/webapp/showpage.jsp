<%@page import="com.nilam.product.entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
   <h1> Show Product Data </h1>
   <a href="list"> show page</a>
   <hr>
   <%
       List<Product> list = (List) request.getAttribute("product");
       for(Product p : list){
    	    
   %>
   <h4>Update Product Name :: <%=p.getProductName()%></h4>
   <h4>Update Product Category :: <%=p.getProductCategory()%></h4> 
   <h4>Update Product MfgDate :: <%=p.getMfgDate()%></h4>
   <h4>Update Product ExpDate :: <%=p.getExpDate()%></h4>
   <h4>Update Product Price :: <%=p.getProductPrice()%></h4>
   <h4>Update Product Quantity :: <%=p.getProductQty()%></h4><br>
   <a href="Update?id=<%=p.getProductId()%>"> update + </a>&nbsp;&nbsp;&nbsp;
   <a href="delete?id=<%=p.getProductId()%>"> delete - </a>&nbsp;&nbsp;&nbsp;
    <a href="get?id=<%=p.getProductId()%>"> get </a>
   <hr>
   <%
   }
   %>
</body>
</html>