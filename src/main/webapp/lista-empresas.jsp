<%@ page import="br.com.alura.gerenciador.servlet.Empresa" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
	Lista de empresas: <br />
	
	<body>
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.nome}</li>
			</c:forEach>
		</ul>
	</body>
</html>
