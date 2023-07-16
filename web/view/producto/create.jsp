<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="sac.serplastin.model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% 
             List<Molde>moldes =(List)request.getAttribute("moldes");
             if(moldes==null){
                moldes=new ArrayList<Molde>();
             }
          %>
        <h1>Nuevo Producto</h1>
        <form action="<%=request.getContextPath()%>/producto/store" method="post" >
            <label>ID_PROD: </label><input type="text" name="ID_PROD"><br>
            <label>NAME_PROD: </label> <input type="text" name="NAME_PROD"><br>
                <label>CATE_PROD: </label> <input type="text" name="CATE_PROD"><br>
             <label>DIMENCIONES_PROD: </label><input type="text" name="DIMENCIONES_PROD"><br>
             <label>DESCRIPCION_PROD: </label><input type="text" name="DESCRIPCION_PROD"><br>
             <label>ID_MOLDE: </label>
            <select name="ID_MOLDE">
                <%for (Molde molde : moldes) {
    
                %>
                <option value="<%=molde.getCodigo()%>"><%=molde.getTipo()%></option>
                <%}%>
            </select>                            
            <br>
            <input type="submit" value="enviar">
        </form>
    </body>
</html>

