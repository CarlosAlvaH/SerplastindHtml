<%-- 
    Document   : edit
    Created on : 2 jul. 2023, 10:21:51
    Author     : docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sac.serplastin.model.Material"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     
        <h1>Actualiar Material</h1>
        <%
            Material material = (material) request.getAttribute("material");
        %>
        <form action="<%=request.getContextPath()%>/material/update" method="post" >
            <input type="hidden" name="id" value="<%=material.getID_MATE()%>"><br>
             NOMBRE_MATE: <input type="text" name="NOMBRE_MATE" value="<%=material.getNOMBRE_MATE()%>"><br>
            TIPO_MATE: <input type="text" name="TIPO_MATE" value="<%=material.getTIPO_MATE()%>"><br>
            MARCA_MATE: <input type="text" name="MARCA_MATE" value="<%=material.getMARCA_MATE()%>"><br>
            COSTE_MATE: <input type="text" name="COSTE_MATE" value="<%=material.getCOSTE_MATE()%>"><br>
            <input type="submit" value="enviar">
          
        </form>
        
    </body>
</html>
