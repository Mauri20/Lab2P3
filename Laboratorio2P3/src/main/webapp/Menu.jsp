<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Menú</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<table class="table1 table table-striped table-dark table-hover">
					<thead>
						<tr>
							<th colspan="3">
								Menu
							</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
								<a href="crudClientes.jsp" class="btn btn-success"> Clientes </a>
							</td>
							<td><a href="crudProveedores.jsp" class="btn btn-success"> Proveedores </a></td>
							<td><a href="crudCompras.jsp" class="btn btn-success"> Compras </a></td>
						</tr>
						<tr>
							<td colspan="3"><a href="index.jsp" class="btn btn-danger"> Salir </a></td>
						</tr>
					</tbody>
					&nbsp;
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>