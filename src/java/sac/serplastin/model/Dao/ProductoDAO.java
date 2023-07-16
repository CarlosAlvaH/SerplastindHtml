/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sac.serplastin.model.Dao;

import java.util.List;
import sac.serplastin.model.Producto;

public interface ProductoDAO {
   public List<Producto> findAll();
   public Producto findByCodigo(String codigo);
   public Producto findByNombre(String nombre);
   public int insert(Producto pro);
   public int update(Producto pro);
   public int delete(String codigo);

    public Object findById(String ID_PROD);

    public void delete(int ID_PROD);
    public String obtainMaxcod();
   
}
