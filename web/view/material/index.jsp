<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="sac.serplastin.model.Material"%>
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
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active">Starter Page</li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <div class="content">
                    <div class="container-fluid">
                        <%
            List<Autor> autores = (List) request.getAttribute("autores");
                        %>
                        <a href="<%=request.getContextPath()%>/autores/create" class="btn btn-success"> Añadir</a>
                        
                        <table class="table table-hover" >
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Apellidos</th>
                                    <th scope="col">Seudonimo</th>
                                    <th scope="col">Pais</th>
                                    <th scope="col">Acciones</th>
                                    <th scope="col">Acciones</th
                                    

                                </tr>
                            </thead>
                            <tbody>
                                <%for (Autor autor : autores) {%>
                                <tr>
                                    <th scope="row"><a href="<%=request.getContextPath()%>/autores/details?id=<%=autor.getId()%>"><%=autor.getId()%></a></th>
                                    <td><%=autor.getNombres()%></td>
                                    <td><%=autor.getApellido1()%></td>
                                    <td><%=autor.getSeudonimo()%></td>
                                    <td><%=autor.getPais()%></td>
                                    <td>
                                      <a href="<%=request.getContextPath()%>/autores/edit?id=<%=autor.getId()%>" class="btn btn-success"> Editar</a>
                     </td>
    
                                        <td>
     
      <a href="<%=request.getContextPath()%>/autores/delete?id=<%=autor.getId()%>" class="btn btn-danger"> Eliminar</a>
  </form>
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
