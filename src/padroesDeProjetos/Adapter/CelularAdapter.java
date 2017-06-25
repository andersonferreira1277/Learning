/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padroesDeProjetos.Adapter;

/**
 *
 * @author Anderson Ferreira Câmara (andersonferreira1277@gmail.com)
 */
public class CelularAdapter implements Dispositivo{
    private CelularAndroid android;

    public CelularAdapter(CelularAndroid android) {
        this.android = android;
    }
    
    @Override
    public void iniciar() {
        android.ligarDispositivo();
    }

    @Override
    public void desligar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reiniciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
