<%-- 
    Document   : home
    Created on : 18 Sep, 2021, 2:24:50 PM
    Author     : ppujita5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to HOME page!</h1>
        <hr/>
         <!-- Display username & role -->
        <p>
            User: <security:authentication property="principal.username" />
            <br/>
            <br/>
            Roles: <security:authentication property="principal.authorities" />
        </p>
        
        <hr/>
        <!--Add a link to point to /leaders to managers & admins-->
        <security:authorize access="hasRole('MANAGER')">
        <p>
            <a href="${pageContext.request.contextPath}/leaders">Leadership meetings </a> (Only for managers) 
        </p>
        </security:authorize>
        <security:authorize access="hasRole('ADMIN')">
        <p>
            <a href="${pageContext.request.contextPath}/systems">IT System meetings </a> (Only for Admins) 
        </p>
        </security:authorize>
        
        <form:form action="${pageContext.request.contextPath}/logout" method="POST">
            <input type="submit" value="Logout" />
                   
        </form:form>
    </body>
</html>
