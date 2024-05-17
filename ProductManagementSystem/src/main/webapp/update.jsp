<%@page import="com.nilam.product.entity.Product"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.nilam.product.util.FactoryProviderUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  int id = (Integer)request.getAttribute("id");
  SessionFactory factory = FactoryProviderUtil.getFactoryProvider();
  Session ss = factory.openSession();
  Product p = ss.get(Product.class, id);
   
%>

<h1>Update Product</h1>
<a href="update.jsp"> update </a><br>

<form action="Update" method="post" >
<input type="hidden" name="id" value="<%=p.getProductId()%>">
<h3>Update Product Name :: <input type="text" name="productName" value="<%=p.getProductName()%>"></h3><br>
<h3>Update Product Category :: <input type="text" name="productCategory" value="<%=p.getProductCategory()%>"></h3><br> 
<h3>Update Product MfgDate :: <input type="text" name="mfgDate" value="<%=p.getMfgDate()%>"></h3><br>
<h3>Update Product ExpDate :: <input type="text" name="expDate" value="<%=p.getExpDate()%>"></h3><br>
<h3>Update Product Price :: <input type="text" name="productPrice" value="<%=p.getProductPrice()%>"></h3><br>
<h3>Update Product Quantity :: <input type="text" name="productQty" value="<%=p.getProductQty()%>"></h3><br>
<input type="submit" value="Update Product"> 

</form>

</body>
</html>