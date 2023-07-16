<%-- 
    Document   : delete
    Created on : 2 jul. 2023, 10:21:59
    Author     : docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
        String id=request.getParameter("id");
        %>
        <h1>Eliminar Producto:<%= id%></h1>
        <form action="<%= request.getContextPath() %>/producto/deleteConfirm" method="post">
            <input type="hidden" name="idConfirm" value="<%=request.getParameter("id")%>">
            <input type="submit" value="Eliminar">
        </form>
    </body>
</html>
