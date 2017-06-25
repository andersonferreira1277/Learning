/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;

/**
 *
 * @author Anderson
 */
public class ResolucaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit toolkit = getDefaultToolkit();
        Dimension scrnsize = toolkit.getScreenSize();
        System.out.println("Tamanha é:" + (int)scrnsize.getWidth() + "X" + (int)scrnsize.getHeight());
        
    }
    
}
