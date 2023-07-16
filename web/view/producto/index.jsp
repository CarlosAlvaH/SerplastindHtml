<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="sac.serplastin.model.Producto"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AdminLTE 3 | Starter</title>
        <%@include file="..\..\template\head_refs.jsp" %>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">

            <%@include file="..\..\template\header_inc.jsp" %>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0"><%=request.getAttribute("titulo")%></h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                              
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <div class="content">
                    <div class="container-fluid">
                        <%
                                List<Producto> productos = (List) request.getAttribute("productos");
                        %>
                        <a href="<%=request.getContextPath()%>/producto/create" class="btn btn-success"> Añadir</a>

                        <table class="table table-hover" >
                            <thead>
                                <tr>
                                    <th scope="col">CODIGO</th>
                                    <th scope="col">NOMBRE</th>
                                    <th scope="col">CATEGORIA</th>
                                    <th scope="col">DIMENCIÓN</th>                 
                                    <th scope="col">DESCRIPCIÓN</th>
                                     <th scope="col"></th>
                                    <th scope="col">ACCIONES</th>
                                   
                                      
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (Producto producto : productos) {
                                %>
                                <tr>
                                    <td scope="row"><a href="<%=request.getContextPath()%>/producto/details?id=<%=producto.getCodigo()%>"><%=producto.getCodigo()%></a></td>
                                    <td><%=producto.getNombre()%></td>
                                    <td><%=producto.getCategoria()%></td>
                                    <td><%=producto.getDimension()%></td>
                                    <td><%=producto.getDescripcion()%></td>
                                    <td>
                                        <a href="<%=request.getContextPath()%>/producto/edit?id=<%= producto.getCodigo()%>" class="btn btn-success"> Editar</a>
                                    </td>
                                    <td>
                                        <a href="<%=request.getContextPath()%>/producto/delete?id=<%=producto.getCodigo()%>" class="btn btn-danger"> Eliminar</a>

                                    </td>
                                       <td>
                                        <a href="<%=request.getContextPath()%>/producto/details?id=<%=producto.getCodigo()%>" class="btn btn-primary"> Detalles</a>

                                    </td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>

                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->
            <%@include file="../../template/footer_inc.jsp" %>
        </div>
        <!-- ./wrapper -->

        <%@include file="../../template/foot_refs.jsp" %>
    </body>
</html>
