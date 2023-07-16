<%-- 
    Document   : create
    Created on : 2 jul. 2023, 10:21:44
    Author     : docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/create.css"/>

    </head>
    <body>
        <h1>Nuevo Material</h1>
        <form action="<%=request.getContextPath()%>/material/store" method="post" >
            ID_MATE: <input type="text" name="ID_MATE"><br>
            NOMBRE_MATE: <input type="text" name="NOMBRE_MATE"><br>
            TIPO_MATE: <input type="text" name=" TIPO_MATE"><br>
            MARCA_MATE: <input type="text" name=" MARCA_MATE"><br>
            STOCK_MATE: <input type="text" name="STOCK_MATE"><br>
             COSTE_MATE: <input type="text" name="COSTE_MATE"><br>
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
