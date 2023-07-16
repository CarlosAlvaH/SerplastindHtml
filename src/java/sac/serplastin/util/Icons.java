package sac.serplastin.util;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Icons {
    public void InserImagen(JLabel lbl, String nomIcon){
         Icon mIcono = new ImageIcon(new ImageIcon(getClass().getResource("file:/F:/Proyecto%20GIT/Seplastin2/src/icons/"+nomIcon+".png")).getImage()
            .getScaledInstance(lbl.getWidth(), lbl.getHeight(), 0));
        lbl.setIcon(mIcono);
    }
    
}
