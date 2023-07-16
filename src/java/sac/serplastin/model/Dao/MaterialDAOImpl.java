/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sac.serplastin.model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sac.serplastin.model.Material;
import sac.serplastin.util.Conexion;

public class MaterialDAOImpl implements MaterialDAO{

    public MaterialDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Material> findAll() {
        String sql="SELECT ID_MATE,NOMBRE_MATE,TIPO_MATE,MARCA_MATE,STOCK_MATE,COSTE_MATE FROM MATERIAL";
        List<Material> listaMate= new ArrayList<>();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Material mate = new Material();
                mate.setCodigo(rs.getString("ID_MATE"));
                mate.setNombre(rs.getString("NOMBRE_MATE"));
                mate.setTipo(rs.getString("TIPO_MATE"));
                mate.setMarca(rs.getString("MARCA_MATE"));
                mate.setStock(rs.getInt("STOCK_MATE"));
                mate.setCoste(rs.getDouble("COSTE_MATE"));
               
                listaMate.add(mate);
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return listaMate;
    }

    @Override
    public Material findByNombre(String nombre) {
        String sql="SELECT ID_MATE,NOMBRE_MATE,TIPO_MATE,MARCA_MATE,STOCK_MATE,COSTE_MATE FROM MATERIAL WHERE NOMBRE_MATE=?";
        Material mate = new Material();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                mate.setCodigo(rs.getString("ID_MATE"));
                mate.setNombre(rs.getString("NOMBRE_MATE"));
                mate.setTipo(rs.getString("TIPO_MATE"));
                mate.setMarca(rs.getString("MARCA_MATE"));
                mate.setStock(rs.getInt("STOCK_MATE"));
                mate.setCoste(rs.getDouble("COSTE_MATE"));
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return mate;
    }

    @Override
    public int insert(Material material) {
        int result = 0;
        String sql = "INSERT INTO MATERIAL (ID_MATE,NOMBRE_MATE,TIPO_MATE,MARCA_MATE,STOCK_MATE,COSTE_MATE) VALUES(?,?,?,?,?,?);";

        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,material.getCodigo());
            stmt.setString(2,material.getNombre());
            stmt.setString(3,material.getTipo());
            stmt.setInt(4,material.getStock());
            stmt.setDouble(5,material.getCoste());
            result = stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return result;
    }

    @Override
    public int delete(String codigo) {
        int result = 0;
        String sql = "DELETE FROM MATERIAL WHERE ID_MATE=?";

        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigo);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return result;
    }

    @Override
    public Material findByCodigo(String codigo) {
        String sql="SELECT ID_MATE,NOMBRE_MATE,TIPO_MATE,MARCA_MATE,STOCK_MATE,COSTE_MATE FROM MATERIALES WHERE ID_MATE=?";
        Material mate = new Material();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                mate.setCodigo(rs.getString("ID_MATE"));
                mate.setNombre(rs.getString("NOMBRE_MATE"));
                mate.setTipo(rs.getString("TIPO_MATE"));
                mate.setMarca(rs.getString("MARCA_MATE"));
                mate.setStock(rs.getInt("STOCK_MATE"));
                mate.setCoste(rs.getDouble("COSTE_MATE"));
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return mate;
    }

    @Override
    public Object findById(int ID_MATE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    
