<%-- 
    Document   : edit
    Created on : 2 jul. 2023, 10:21:51
    Author     : docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sac.serplastin.model.Producto"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualiar Producto</h1>
        <%
            Producto producto = (Producto) request.getAttribute("producto");
        %>
        <form action="<%=request.getContextPath()%>/producto/update" method="post" >
            <input type="hidden" name="ID_PROD" value="<%=producto.getCodigo()%>"><br>
             NAME_PROD: <input type="text" name=" NAME_PROD" value="<%=producto.getNombre()%>"><br>
             
             CATE_PROD: <input type="text" name="CATE_PROD"  value="<%=producto.getCategoria()%>"><br>
            DIMENSIONES_PROD: <input type="text" name="DIMENSIONES_PROD" value="<%=producto.getDimension()%>"><br>
            DESCRIPCION_PROD: <input type="text" name="DESCRIPCION_PROD" value="<%=producto.getDescripcion()%>"><br>
            ID_MOLDE: <input type="text" name="ID_MOLDE" value="<%=producto.getCodMold()%>"><br>
            <input type="submit" value="enviar">
          
        </form>
        
    </body>
</html>
