<%@page import="com.google.appengine.api.datastore.PreparedQuery"%>
<%@page import="com.google.appengine.api.datastore.Entity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuarios</title>

<script type="text/javascript">

	function eliminar(Id){
		document.frm_eliminar.ID.value = Id;
		document.frm_eliminar.submit();		
	}
	
	function actualizar(Id){
		document.frm_actualizar.IDoriginal.value = Id;
		document.frm_actualizar.submit();		
	}

</script>

</head>
<body>
<table cellpadding="15" border="1" style="background-color: #ffffcc;">
<th>ID</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Edad</th>
<th>Email</th>


<%
PreparedQuery pq = (PreparedQuery)request.getAttribute("pq");

for(Entity e1:pq.asIterable()){	
	
	%>
<tr>
<td><%=e1.getProperty("ID").toString()%></td>
<td><%=e1.getProperty("Nombre").toString()%></td>
<td><%=e1.getProperty("Apellido".toString())%></td>
<td><%=e1.getProperty("Edad").toString() %></td>
<td><%=e1.getProperty("Email").toString() %></td>
<td><a href="javascript:void(0)" onclick="eliminar(<%=e1.getProperty("ID").toString()%>)">Eliminar</a></td>
<td><a href="javascript:void(0)" onclick="actualizar(<%=e1.getProperty("ID").toString()%>)">Actualizar</a></td>
</tr>	
<% 	
}
%>
</table>

<form name="frm_eliminar" action="eliminarServlet" method="post">
<input type="hidden" name="ID"/>
</form>

<form name="frm_actualizar" action="actualizar.jsp" method="post">
<input type="hidden" name="IDoriginal"/>
</form>

</body>
</html>