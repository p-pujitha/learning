<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

    <h1>Hello world from JSP</h1>
    <%
    Integer id = (Integer) request.getAttribute("id");
        String  name = (String) request.getAttribute("name");
    out.println("Id :" +id);
    out.println("Name :" + name);
    %>
    <br />
   <!-- <b> ${id} </b>
     <b> ${name} </b> -->

</body>
</html>