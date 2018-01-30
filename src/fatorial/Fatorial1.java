/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;
/**
 *
 * @author Anderson
 */
public class Fatorial1 {
    private int num;
    private int fat;
    private String formula;
    public void setValor(int num){
        int f = 1;
        String s = "";
        for (int count = num; count > 1; count--){
            f*=count;
            s+= count + " X ";
        }
        s+="1 = ";
        fat = f;
        formula = s;
    }
    public int getFatorial(){
        return fat;
    }
    public String getFormula(){
        return formula;
    }
}
