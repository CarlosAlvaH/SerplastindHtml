package sac.serplastin.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import sac.serplastin.model.Dao.MoldeDAO;
import sac.serplastin.model.Dao.MoldeDAOImpl;
import sac.serplastin.model.Dao.ProductoDAO;
import sac.serplastin.model.Dao.ProductoDAOImp;
import sac.serplastin.model.Producto;

/**
 *
 * @author docente
 */
@WebServlet(name = "ProductoController",
        urlPatterns = {"/producto", "/producto/index",
            "/producto/edit", "/producto/detail", "/producto/create","/producto/details",
            "/producto/delete","/producto/deleteConfirm", "/producto/store", "/producto/update"})
public class ProductoController extends HttpServlet {

    private static final ProductoDAO productoDAO = (ProductoDAO) new ProductoDAOImp();
    private static final MoldeDAO moldeDAO = (MoldeDAO) new MoldeDAOImpl();
    private String path;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String urlPattern = request.getServletPath();

        switch (urlPattern) {
            case "/producto":
            case "/producto/index":
                out.print("Aqui se visualizara la lista de productos");
                index(request, response);
                break;
            case "/producto/create":
                out.print("Aqui se visualizara se presentara formulario nuevo producto");
                create(request, response);
                break;
            case "/producto/edit":
                out.print("Aqui se visualizara se presentara formulario editar producto");
                edit(request, response);
                break;
            case "/producto/delete":
                out.print("Aqui se visualizara se procesara la eliminacion de un producto");
                delete(request, response);
                break;
            case "/producto/deleteConfirm":
                out.print("Aqui se visualizara se procesara la eliminacion de un producto");
                deleteConfirm(request, response);
                break;
            case "/producto/store":
                out.print("Aqui se visualizara se guardara datos de nuevo producto");
                store(request, response);
                break;
            case "/producto/update":
                out.print("Aqui se visualizara se actualizara datos de producto");
                update(request, response);
                break;
            case "/producto/details":
                out.print("Aqui se visualizara se actualizara datos de producto");
                details(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/producto/index.jsp";
        request.setAttribute("titulo", "Listado de productos");
        request.setAttribute("productos", productoDAO.findAll());        
        processUrl(path, request, response);

    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/producto/create.jsp";
        request.setAttribute("titulo", "Crear Producto");
        request.setAttribute("moldes", moldeDAO.findAll());
        processUrl(path, request, response);
    }

    private void details(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/producto/details.jsp";
        String ID_PROD = request.getParameter("id");
        request.setAttribute("producto", productoDAO.findById(ID_PROD));
        processUrl(path, request, response);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/producto/edit.jsp";
        String ID_PROD = request.getParameter("id");
        Producto producto = (Producto) productoDAO.findById(ID_PROD);
        request.setAttribute("producto", producto);

        processUrl(path, request, response);

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ID_PROD = request.getParameter("id");
        // autorDao.delete(id);
        String path = "/view/producto/delete.jsp?id=" + ID_PROD;
        processUrl(path, request, response);
    }

    private void deleteConfirm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ID_PROD = request.getParameter("idConfirm");
        productoDAO.delete(ID_PROD);
        response.sendRedirect(request.getContextPath() + "/producto");
    }

    private void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto producto = new Producto();
        producto.setCodigo(generateCorrelativo());
        producto.setNombre(request.getParameter("NAME_PROD"));
        producto.setCategoria(request.getParameter("CATE_PROD"));
        producto.setDimension(request.getParameter("DIMENSIONES_PROD"));
        producto.setDescripcion(request.getParameter("DESCRIPCION_PROD"));
        producto.setCodMold(request.getParameter("ID_MOLDE"));
        productoDAO.insert(producto);

        response.sendRedirect(request.getContextPath() + "/producto");

    }
    private String generateCorrelativo(){
        String codigoMax=productoDAO.obtainMaxcod();
        String codigo="POD001";
        if(codigoMax!=null){
            int correlativo=Integer.parseInt(codigoMax.substring(3,codigoMax.length()))+1;
            codigo=codigoMax.substring(0,3).concat(String.format("%03d",correlativo));
        }
        return codigo;
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto producto = new Producto();
        producto.setCodigo(request.getParameter("ID_PROD"));
        producto.setNombre(request.getParameter("NAME_PROD"));
        producto.setCategoria(request.getParameter("CATE_PROD"));
        producto.setDimension(request.getParameter("DIMENSIONES_PROD"));
        producto.setDescripcion(request.getParameter("DESCRIPCION_PROD"));
        producto.setCodMold(request.getParameter("ID_MOLDE"));
        productoDAO.update(producto);

        response.sendRedirect(request.getContextPath() + "/producto");
    }

    protected void processUrl(String path, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        RequestDispatcher rd = ctx.getRequestDispatcher(path);

        if (rd != null) {
            rd.forward(request, response);
        } else {
            // log.error("LA RUTA NO ES VALIDA.");
        }
    }

}
