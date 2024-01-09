<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
<body>

<form class="row g-3" action="AddDataModel">

    <label>Id</label>
    <input type="text" name="aid">

    <label>Name</label>
    <input type="text" name="aName">
  
    <label>Father</label>
    <input type="text" name="fName">
  
    <input type="submit">
    
    
    
</form>

<form action="GetDataModel">
<label>Aid</label>
    <input type="text" name="aid">
  
    <input type="submit">
 </form>
 
</body>
</html>