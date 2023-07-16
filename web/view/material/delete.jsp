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
        int id=Integer.parseInt(request.getParameter("ID_MATE"));
        %>
        <h1>Eliminar material:<%= id%></h1>
        <form action="<%= request.getContextPath() %>/material/deleteConfirm" method="post">
            <input type="hidden" name="idConfirm" value="<%= request.getParameter("ID_MATE") %>">
            <input type="submit" value="Eliminar">
        </form>
    </body>
</html>
