<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��� ��� ������</title>
</head>
<body>
	empList ���<br>
	��� ��� �������Դϴ�.<br>
<%
	// SSR�� CSR�� ����
	// �������� EmpLogic.java -> EmpDao.java -> List<Map>
	// mav.addObject("empList", empList);
	// request.setAttribute("empList", empList);
	// �̷��� ����� [forward]����̴�.
	List<Map<String, Object>> empList = (List<Map<String, Object>>)request.getAttribute("empList");
	out.println(empList);
	int size=0;
	if(empList!=null){
		size = empList.size();
	}
	/* or(Map<String, Object> map : empList){
		
		out.println()
	} */
%>
	${empList.toString()}
</body>
</html>