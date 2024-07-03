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

 	String cod = request.getAttribute("codigo").toString();
    String nom = request.getAttribute("nombre").toString();
    Double precioVenta = Double.parseDouble(request.getAttribute("pv").toString());
    Double precioCompleto = Double.parseDouble(request.getAttribute("pc").toString());
    String est = request.getAttribute("estado").toString();
    String desc = request.getAttribute("descripcion").toString();

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
<td><input type="text" name="apellido" value="<%=cod%>"></td>
</tr>
<tr>
<td>PrecioVenta</td>
<td><input type="text" name="dni" value="<%=precioVenta%>"></td>
</tr>
<tr>
<td>Precio Completo</td>
<td><input type="text" name="email" value="<%=precioCompleto%>"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="telefono" value="<%=est%>"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="sexo" value="<%=desc%>"></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="Actulizar Cliente"></td>
</tr>

</table>



</form>

</body>
</html>