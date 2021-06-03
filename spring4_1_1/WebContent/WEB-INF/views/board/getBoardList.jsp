<%@page import="org.apache.logging.log4j.core.util.JsonUtils"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.util.HangulConversion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 구현 - WEB-INF</title>
</head>
<body>

	게시판 구현 페이지 입니다. WEB-INF
	<h1>${name}</h1>
	<h1>
		입력된 이름:
		<%
		out.println(HangulConversion.toUTF(request.getParameter("mem_name")));
		%>
	</h1>
	${list}
</body>
</html>