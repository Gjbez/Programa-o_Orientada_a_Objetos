/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author gbez
 */
import java.text.DecimalFormat;
public class App {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.h = 1.75;
        p1.p = 78;
        
        Pessoa p2 = new Pessoa();
        p2.h = 1.50;
        p2.p = 59;
        
        DecimalFormat df = new DecimalFormat("0,0");
        System.out.println("IMC = " + df.format(p1.calcularimc()));
        System.out.println("IMC P2 = " + df.format(p2.calcularimc()));
    }
    
}
