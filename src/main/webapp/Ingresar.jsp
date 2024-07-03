<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html4">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingresar al Sistema</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Ingresar al Sistema</h1>
<form action="ControladorUsuario" method="post">

<table border="2" align="center">

<tr>
<td>usuario</td>
<td><input type="text" name="usuario"></td>
</tr>

<tr>
<td>password</td>
<td><input type="password"  step="0.01" name="password"></td>
</tr>


<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>

 </table>



</form> <!-- fin del form -->


</body>
</html>