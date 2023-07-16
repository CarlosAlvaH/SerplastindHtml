<%-- 
    Document   : details
    Created on : 2 jul. 2023, 10:22:08
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
        <h1>Detalle del material</h1>
        <div class="detail">
            <img src="${material.foto}">
            <label>${material.NOMBRE_MATERIAL}</label>
            <a href="<%=request.getContextPath()%>/material"> volver</a>
        </div>
    </body>
</html>
