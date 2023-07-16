/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sac.serplastin.model.Dao;

import java.util.List;
import sac.serplastin.model.Material;

public interface MaterialDAO {
    public List<Material> findAll();
    public Material findByCodigo(String codigo);
    public Material findByNombre(String nombre);
    public int insert(Material material);
    public int delete(String codigo);

    public Object findById(int ID_MATE);
    
}
