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
import sac.serplastin.model.Molde;
import sac.serplastin.util.Conexion;

/**
 *
 * @author solra
 */
public class MoldeDAOImpl implements MoldeDAO{

    @Override
    public List<Molde> findAll() {
        String sql = "SELECT ID_MOLDE,TIPO_MOLDE,DATEFABR_MOLDE,ID_COLAB,ID_MATE FROM MOLDE";
        List<Molde> listaMoldes = new ArrayList<>();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Molde mol = new Molde();
                mol.setCodigo(rs.getString("ID_MOLDE"));
                mol.setTipo(rs.getString("TIPO_MOLDE"));
                mol.setFechaFabri(rs.getString("DATEFABR_MOLDE"));
                mol.setCodColab(rs.getString("ID_COLAB"));
                mol.setCodMate(rs.getString("ID_MATE"));

                listaMoldes.add(mol);
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return listaMoldes;
    }

    @Override
    public int insert(Molde molde) {
        int result = 0;
        String sql = "INSERT INTO MOLDE(ID_MOLDE,TIPO_MOLDE,DATEFABR_MOLDE,ID_MATE, ID_COLAB) VALUES(?,?,?,?,?);";

        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,molde.getCodigo());
            stmt.setString(2,molde.getTipo());
            stmt.setString(3,molde.getFechaFabri());
            stmt.setString(4,molde.getCodMate());
            stmt.setString(5,molde.getCodColab());
            result = stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return result;
    }

    @Override
    public int delete(String codigo) {
        int result = 0;
        String sql = "DELETE FROM MOLDE WHERE ID_MOLDE=?";

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
    public Molde finByCode(String Codigo) {
        String sql = "SELECT ID_MOLDE,TIPO_MOLDE,DATEFABR_MOLDE,ID_COLAB,ID_MATE FROM MOLDE WHERE ID_MOLDE=?";
        Molde mol= new Molde();
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                mol.setCodigo(rs.getString("ID_MOLDE"));
                mol.setTipo(rs.getString("TIPO_MOLDE"));
                mol.setFechaFabri(rs.getString("DATEFABR_MOLDE"));
                mol.setCodColab(rs.getString("ID_COLAB"));
                mol.setCodMate(rs.getString("ID_MATE"));
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        return mol;
    }
    
}
