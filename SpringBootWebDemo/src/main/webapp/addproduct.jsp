<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<form action="/add" method="post">
	  <div class="mb-3">
	    <label for="name" class="form-label">Product Name</label>
	    <input type="text" class="form-control" id="name" aria-describedby="name" name="name">
	  </div>
	  <div class="mb-3">
	    <label for="price" class="form-label">Product Price</label>
	    <input type="text" class="form-control" id="price" name="price">
	  </div>
	  <button type="submit" class="btn btn-primary">Add Product</button>
	</form>
</body>
</html>