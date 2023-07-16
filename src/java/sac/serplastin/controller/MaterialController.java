
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
import sac.serplastin.model.Dao.MaterialDAO;
import sac.serplastin.model.Dao.MaterialDAOImpl;
import sac.serplastin.model.Material;
import sac.serplastin.model.Producto;

/**
 *
 * @author docenteproducto
 */
@WebServlet(name = "MaterialController", 
        urlPatterns = {"/material", "/material/index",
        "/material/edit", "/material/detail", "/material/create",
        "/material/delete", "/material/store", "/material/update"})
public class MaterialController extends HttpServlet {

   
    private static final MaterialDAO MaterialDAO = (MaterialDAO) new MaterialDAOImpl();
    private String path;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String urlPattern = request.getServletPath();

        switch (urlPattern) {
            case "/material":
            case "/material/index":
                out.print("Aqui se visualizara la lista de productos");
                index(request, response);
                break;
            case "/material/create":
                out.print("Aqui se visualizara se presentara formulario nuevo producto");
                create(request, response);
                break;
            case "/material/edit":
                out.print("Aqui se visualizara se presentara formulario editar producto");
                edit(request, response);
                break;
            case "/material/delete":
                out.print("Aqui se visualizara se procesara la eliminacion de un producto");
                delete(request, response);
                break;
            case "/material/store":
                out.print("Aqui se visualizara se guardara datos de nuevo producto");
                store(request, response);
                break;
            case "/material/update":
                out.print("Aqui se visualizara se actualizara datos de producto");
                update(request, response);
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
         String path = "/view/material/index.jsp";
         request.setAttribute("titulo", "Listado de materiales");
         processUrl(path, request, response);
       //request.setAttribute("producto", listaProducto);
        processUrl(path, request, response);

    }


    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/material/create.jsp";
        processUrl(path, request, response);
    }
private void details(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/material/details.jsp";
        int ID_MATE = Integer.parseInt(request.getParameter("ID_MATE"));
        request.setAttribute("material", MaterialDAO.findById(ID_MATE));
        processUrl(path, request, response);
    }
     private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/view/material/edit.jsp";
        int ID_MATE = Integer.parseInt(request.getParameter("ID_MATE"));
        //Material material = (material) MaterialDAO.findById(ID_MATE);
       // request.setAttribute("material", material);

        processUrl(path, request, response);

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int ID_MATE = Integer.parseInt(request.getParameter("ID_PROD"));
        // autorDao.delete(id);
        String path = "/view/material/delete.jsp?id=" + ID_MATE;
        processUrl(path, request, response);
    }
    private void deleteConfirm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ID_MATE = Integer.parseInt(request.getParameter("idConfirm"));
      //  MaterialDAO.delete(ID_MATE);
        response.sendRedirect(request.getContextPath() + "/material");
    }

  private void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     

        response.sendRedirect(request.getContextPath() + "/ material");

    }


   private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto producto = new Producto();
        producto.setCodigo(request.getParameter("ID_PROD"));
        producto.setNombre(request.getParameter("NAME_PROD"));
        producto.setCategoria(request.getParameter("CATE_PROD"));
        producto.setDimension(request.getParameter("DIMENSIONES_PROD"));
        producto.setDescripcion(request.getParameter("DESCRIPCION_PROD"));
        producto.setCodMold(request.getParameter("ID_MOLDE"));
        //ProductoDAO.update(producto);

        response.sendRedirect(request.getContextPath() + "/autores");
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

    private static class material {

        public material() {
        }
    }

}
