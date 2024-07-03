<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="model.TblProductocl3" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>

<body bgcolor="#c5dec9">
<h1 align="center">Listado de Productos</h1>

<h2 align="center">
<a href="FormRegistrarProducto.jsp">Registrar Producto</a>
</h2>

<table border="2" align="center">
    <tr>
        <td>Codigo</td>
        <td>Nom</td>
        <td>Pv</td>
        <td>Pc</td>
        <td>Est</td>
        <td>Des</td> 
        <td>Acciones</td> 
    </tr>
    


   <%
List<TblProductocl3> ListadoProductos = (List<TblProductocl3>) request.getAttribute("listadoproducto");

if (ListadoProductos != null) {
    for (TblProductocl3 lis : ListadoProductos) { // Aquí utilizamos ListadoProductos en el bucle
%>

<tr>
    <td><%= lis.getIdproductoscl3() %></td>
    <td><%= lis.getNombrecl3() %></td>
    <td><%= lis.getPrecioventacle()%></td>
    <td><%= lis.getPreciocompcl3() %></td>
    <td><%= lis.getEstadocl3() %></td>
    <td><%= lis.getDescripcl3() %></td>
    <td><a href="ControladorProducto?accion=Eliminar&cod=<%=lis.getIdproductoscl3() %>">Eliminar</a> </td> 
		
	<td><a href="ControladorProducto?accion=Modificar&cod=<%=lis.getIdproductoscl3()%>">Actualizar</a></td>
</tr>

<%
    }
}
%>
</table>
</body>
</html>