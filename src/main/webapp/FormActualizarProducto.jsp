<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="model.TblProductocl3" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Producto</title>
</head>
<body  bgcolor="#c5dec9">
<h1 align="center">Actualizar Producto</h1>

<form  method="post" action="ControladorProducto">

<%
    String cod = (request.getAttribute("codigo") != null) ? request.getAttribute("codigo").toString() : "";
    String nom = (request.getAttribute("nombre") != null) ? request.getAttribute("nombre").toString() : "";
    String precioVentaStr = (request.getAttribute("precioVenta") != null) ? request.getAttribute("precioVenta").toString() : "";
    String precioCompletoStr = (request.getAttribute("precioCompra") != null) ? request.getAttribute("precioCompra").toString() : "";
    String est = (request.getAttribute("estado") != null) ? request.getAttribute("estado").toString() : "";
    String desc = (request.getAttribute("descripcion") != null) ? request.getAttribute("descripcion").toString() : "";
%>

<table align="center"  borde="2">
<input type="hidden" name="codigo"  value="<%=cod%>">
<tr>
<td>Nombre</td>
<td>
<input type="text" name="nombre" value="<%=nom%>">
</td>
</tr>
<tr>
<td>Codigo</td>
<td><input type="text" name="codigo" value="<%=cod%>"></td>
</tr>
<tr>
<td>PrecioVenta</td>
<td><input type="text" name="precioVenta" value="<%=precioVentaStr%>"></td>
</tr>
<tr>
<td>Precio Completo</td>
<td><input type="text" name="precioCompra" value="<%=precioCompletoStr%>"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estado" value="<%=est%>"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion" value="<%=desc%>"></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="Actualizar Cliente"></td>
</tr>

</table>

</form>

</body>
</html>