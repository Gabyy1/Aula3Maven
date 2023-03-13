<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/styles.css">
<title>Viagem</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp" />
	</div>
	<br />
	<div align="center" class="container">
		<form action="viagem" method="post">
			<p class="title">
				<b>viagem</b>
			</p>
			<table>
				<tr>
					<td>
						<input class="id_input_data" type="number" min="0"
							step="1" id="codigo" name="codigo" placeholder="#CODIGO">
					</td>
					<td>
						<input type="submit" id="botao" name="botao" value="Buscar">
					</td>
					</tr>
					<tr>
					<td>
						<input class="input_data" type="text" id="placaOnibus" name="placaOnibus"
								placeholder="PlacaOnibus">
					</td>
					<td>
						<input class="input_data" type="number" id="codigoMotorista" name="codigoMotorista"
								placeholder="codigoMotorista">
					</td>
					<td>
						<input class="input_data" type="text" id="saida" name="saida"
								placeholder="saida">
					</td>
					<td>
						<input class="input_data" type="text" id="chegada" name="chegada"
								placeholder="chegada">
					</td>
					<td>
						<input class="input_data" type="text" id="partida" name="partida"
								placeholder="partida">
					</td>
					<td>
						<input class="input_data" type="text" id="destino" name="destino"
								placeholder="destino">
					</td>
					</tr>
			</table>
		</form>
	</div>
	<div align="center">
		<c:if test="${not empty erro }">
			<c:out value="${erro }" />
		</c:if>
		
	</div>
	<div align="center">
		<c:if test="${not empty saidaa }">
			<c:out value="${saidaa }" />
		</c:if>
		
	</div>

</body>
</html>