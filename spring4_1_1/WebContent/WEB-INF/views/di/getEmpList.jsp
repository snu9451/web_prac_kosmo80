<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%
	// SSR과 CSR이 공존
	List<Map<String, Object>> empList = (List<Map<String, Object>>)request.getAttribute("empList");
	for(Map<String, Object> map : empList){
		
		out.println()
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>사원 목록 페이지</title>
</head>
<body>
	empList 출력<br>
	사원 목록 페이지입니다.
</body>
</html>