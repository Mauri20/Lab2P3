<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-6">
	            <div class="card">
	                <form action="ControllerAcceso" method="post" class="box">
	                    <h1>AgenciaC</h1>
	                    <p class="text-muted"> Ingresa tus credenciales para Acceder!</p> 
	                    <input type="text" name="user" autocomplete="false" placeholder="Usuario"> 
	                    <input type="password" name="pass" placeholder="Contrase&ntilde;a"> 
	                    <a class="forgot text-muted" href="#">Crear Cuenta?</a> 
	                    <input type="submit" name="" value="Acceder" href="#">
	                </form>
	            </div>
	        </div>
	    </div>
	</div>
</body>
</html>