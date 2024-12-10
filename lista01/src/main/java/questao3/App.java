/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author gbez
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,0");
        
        for (int i = 0; i < 3; i++){
        
         Pessoa p1 = new Pessoa();
        System.out.print("Digite a altura");
        double h = o.nextDouble();
        System.out.print("Digite o peso");
        double p = o.nextDouble();
        p1.h = h;
        p1.p = p;
        System.out.println("IMC = " + df.format(p1.calcularimc()));
        o.close();
  }
 }
}
