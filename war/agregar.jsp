<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar</title>
</head>
<body>
<form action="agregarServlet" method="post"><h3>Registrar</h3>
<table border="red">
<tr><td>ID</td><td><input type="text" name="ID"/></td></tr>
<tr><td>Nombre</td><td><input type="text" name="Nombre"/></td></tr>
<tr><td>Apellido</td><td><input type="text" name="Apellido"/></td></tr>
<tr><td>Edad</td><td><input type="text" name="Edad"/></td></tr>
<tr><td>Email</td><td><input type="text" name="Email"/></td></tr>
<tr><td colspan="3"><input type="submit" value="submit"/></tr>
</table>
</form>
</body>
</html>