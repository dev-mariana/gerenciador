<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>
	<c:if test="${ not empty empresa }">
		<p>Empresa ${ empresa } cadastrada com sucesso!</p> 
	</c:if>
	
	<h3>Lista de Empresas:</h3> 
	
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			<li>
				${ empresa.nome } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?acao=EditarEmpresa&id=${ empresa.id }">editar</a>
				<a href="/gerenciador/entrada?acao=RemoverEmpresa&id=${ empresa.id }">remover</a>
			</li>
		</c:forEach>
	</ul>	
</body>
</html>