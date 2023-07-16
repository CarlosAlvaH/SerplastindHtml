
package sac.serplastin.model.Dao;

import java.util.List;
import sac.serplastin.model.Molde;

public interface MoldeDAO {
    public List<Molde> findAll();
    public Molde finByCode(String Codigo);
    public int insert(Molde molde);
    public int delete(String codigo);
}
