<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.pujitha.spring.springmvc.dto.Employee,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
		for (Employee e : employees) {
			out.println(e.getId());
			out.println(e.getName());
		}
	%>
</body>
</html>