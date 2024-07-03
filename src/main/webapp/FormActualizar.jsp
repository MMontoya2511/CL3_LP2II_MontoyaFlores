<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar PRODUCTO</title>
</head>
<body bgcolor="#c5dec9">
<h1>Actualizar PRODUCTO</h1>


    
<form method="post" action="ControladorProducto">

	String cod = request.getAttribute("codigo").toString();
    String nom = request.getAttribute("nombre").toString();
    Double precioVenta = Double.parseDouble(request.getAttribute("pv").toString());
    Double precioCompleto = Double.parseDouble(request.getAttribute("pc").toString());
    String est = request.getAttribute("estado").toString();
    String desc = request.getAttribute("descripcion").toString();

   <table align="center" border="2">
   
   <tr>
   <td>
   <input type="text" name="codigo">
   </td>
   </tr>
   
   <tr>
   <td>Nombre</td>
   <td>
   <input type="text" name="codigo">
   </td>
   </tr>
    
   <tr>
   <td>PrecioVenta</td>
   <td>
   <input type="text" name="pv">
   </td>
   </tr>
   
   <tr>
   <td>PrecioCompleto</td>
   <td>
   <input type="text" name="pc">
   </td>
   </tr>
   
   <tr>
   <td>Estado</td>
   <td>
   <input type="text" name="Estadi">
   </td>
   </tr>
   
   <tr>
   <td>Descripcion</td>
   <td>
   <input type="text" name="descripcion">
   </td>
   </tr>
   
   <tr>
   <td colspan="2" align="center"><input type="submit" value="Actualizar Producto" ></td>
   </tr>
   
    </table>
</form>

</body>
</html>