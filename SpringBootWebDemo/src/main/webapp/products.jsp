<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style>
     .details{
           background-color:#555;
           color:#fff;
           
           }
</style>
</head>
<body>
 <h1><center>list of products</center></h1>
 <%-- <p>${list}</p> --%>
 <div class='container text-center'>
 <c:forEach items="${list }" var="product">
     <div class='details'>
    <b> <p>${product.pid}</p>
     <p>${product.name}</p>
     <p>${product.price}</p></b>
     <p><a href="/products/delete/${product.pid}">Delete</a></p>
     </div>
 </c:forEach>
 </div>
</body>
</html>