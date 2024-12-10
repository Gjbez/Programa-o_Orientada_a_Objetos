/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

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
        
        Pessoa[] pessoas = new Pessoa[3];
        
        for (int i = 0; i < 3; i++){
        Pessoa ps = new Pessoa();
         System.out.print("Digite o nome");
         ps.nome = o.next();
        System.out.print("Digite a altura");
        double h = o.nextDouble();
        System.out.print("Digite o peso");
        double p = o.nextDouble();
        ps.h = h;
        ps.p = p;
        pessoas[i] = ps;
        
  }
        for (int i = 2; i >= 0; i-- ){
        System.out.println("Nome: " + pessoas[i].nome);
        System.out.println("Peso: " + pessoas[i].p);
        System.out.println("Altura: " + pessoas[i].h);
        System.out.println("IMC ( " + i + ") = " + df.format(pessoas[i].calcularimc()));
        o.close();
     }        
   }
}