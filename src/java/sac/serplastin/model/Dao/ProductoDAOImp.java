package sac.serplastin.model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sac.serplastin.model.Producto;
import sac.serplastin.util.Conexion;

public class ProductoDAOImp implements ProductoDAO {

    @Override
    public List<Producto> findAll() {
        String sql = "SELECT ID_PROD,NAME_PROD,CATE_PROD,DIMENSIONES_PROD,DESCRIPCION_PROD,ID_MOLDE FROM PRODUCTO";
        List<Producto> listaPro = new ArrayList<>();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setCodigo(rs.getString("ID_PROD"));
                pro.setNombre(rs.getString("NAME_PROD"));
                pro.setCategoria(rs.getString("CATE_PROD"));
                pro.setDimension(rs.getString("DIMENSIONES_PROD"));
                pro.setDescripcion(rs.getString("DESCRIPCION_PROD"));
                pro.setCodMold(rs.getString("ID_MOLDE"));

                listaPro.add(pro);
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return listaPro;
    }

    @Override
    public Producto findByCodigo(String codigo) {
        String sql = "SELECT ID_PROD,NAME_PROD,CATE_PROD,DIMENSIONES_PROD,DESCRIPCION_PROD,ID_MOLDE FROM PRODUCTO WHERE ID_PROD=?";
        Producto pro = new Producto();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                pro.setCodigo(rs.getString("ID_PROD"));
                pro.setNombre(rs.getString("NAME_PROD"));
                pro.setCategoria(rs.getString("CATE_PROD"));
                pro.setDimension(rs.getString("DIMENSIONES_PROD"));
                pro.setDescripcion(rs.getString("DESCRIPCION_PROD"));
                pro.setCodMold(rs.getString("ID_MOLDE"));
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return pro;
    }

    @Override
    public Producto findByNombre(String nombre) {
        String sql = "SELECT ID_PROD,NAME_PROD,CATE_PROD,DIMENSIONES_PROD,DESCRIPCION_PROD,ID_MOLDE FROM PRODUCTO WHERE NAME_PROD=?";
        Producto pro = new Producto();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                pro.setCodigo(rs.getString("ID_PROD"));
                pro.setNombre(rs.getString("NAME_PROD"));
                pro.setCategoria(rs.getString("CATE_PROD"));
                pro.setDimension(rs.getString("DIMENSIONES_PROD"));
                pro.setDescripcion(rs.getString("DESCRIPCION_PROD"));
                pro.setCodMold(rs.getString("ID_MOLDE"));
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return pro;
    }

    @Override
    public int insert(Producto pro) {
        int result = 0;
        String sql = "INSERT INTO PRODUCTO(ID_PROD,NAME_PROD,CATE_PROD,DIMENSIONES_PROD,DESCRIPCION_PROD,ID_MOLDE) VALUES(?,?,?,?,?,?)";

        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pro.getCodigo());
            stmt.setString(2, pro.getNombre());
            stmt.setString(3, pro.getCategoria());
            stmt.setString(4, pro.getDimension());
            stmt.setString(5, pro.getDescripcion());
            stmt.setString(6, pro.getCodMold());
            result = stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return result;
    }

    @Override
    public int delete(String codigo) {
        int result = 0;
        String sql = "DELETE FROM PRODUCTO WHERE ID_PROD=?";

        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigo);
            result = stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return result;
    }

    @Override
    public Object findById(String ID_PROD) {
        String sql = "SELECT ID_PROD,NAME_PROD,CATE_PROD,DIMENSIONES_PROD,DESCRIPCION_PROD,ID_MOLDE FROM PRODUCTO WHERE ID_PROD=?";
        Producto pro = new Producto();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ID_PROD);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                pro.setCodigo(rs.getString("ID_PROD"));
                pro.setNombre(rs.getString("NAME_PROD"));
                pro.setCategoria(rs.getString("CATE_PROD"));
                pro.setDimension(rs.getString("DIMENSIONES_PROD"));
                pro.setDescripcion(rs.getString("DESCRIPCION_PROD"));
                pro.setCodMold(rs.getString("ID_MOLDE"));
            }

        } catch (SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return pro;
    }

    @Override
    public void delete(int ID_PROD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String obtainMaxcod() {
        String sql = "SELECT max(ID_PROD) FROM PRODUCTO";
        String maxCod=null;
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                maxCod = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return maxCod;
    }

    @Override
    public int update(Producto pro) {
       int result = 0;
        String sql = "update PRODUCTO set NAME_PROD=?,DIMENSIONES_PROD=?,DESCRIPCION_PROD=?,ID_MOLDE=?"
                + " where ID_PROD=?";

        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, pro.getNombre());
            stmt.setString(2, pro.getDimension());
            stmt.setString(3, pro.getDescripcion());
            stmt.setString(4, pro.getCodMold());
            stmt.setString(5, pro.getCodigo());
            result = stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return result;
    }

}
