<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%
	// SSR�� CSR�� ����
	List<Map<String, Object>> empList = (List<Map<String, Object>>)request.getAttribute("empList");
	for(Map<String, Object> map : empList){
		
		out.println()
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��� ��� ������</title>
</head>
<body>
	empList ���<br>
	��� ��� �������Դϴ�.
</body>
</html>