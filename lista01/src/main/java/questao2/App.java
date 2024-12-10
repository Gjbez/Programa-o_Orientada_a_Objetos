/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author gbez
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
       
        System.out.print("Digite a altura");
        double h = o.nextDouble();
        System.out.print("Digite o peso");
        double p = o.nextDouble();
        
        Pessoa ps = new Pessoa();
        ps.h = h;
        ps.p = p;
        
         DecimalFormat df = new DecimalFormat("0,0");
        System.out.println("IMC = " + df.format(ps.calcularimc()));
    
 }
}
