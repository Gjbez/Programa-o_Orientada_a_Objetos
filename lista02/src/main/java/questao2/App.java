/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author gbez
 */

import java.util.Scanner;
public class App {
     public App() {
        Scanner o = new Scanner(System.in);
        
         System.out.println("Escreva número");
         String numero = o.nextLine();
         System.out.println("Escreva titular");
         String titular = o.nextLine();
         
         ContaBancaria c1 = new ContaBancaria();
         c1.setNumero(numero);
         c1.setTitular(titular);
         
         System.out.println("Escreva número");
         numero = o.nextLine();
         System.out.println("Escreva titular");
         titular = o.nextLine();
         
         ContaBancaria c2 = new ContaBancaria();
         c2.setNumero(numero);
         c2.setTitular(titular);
         
         //a)
         c1.depositar(1000);
         System.out.println("c1: Saldo R$" + c1.getSaldo());
         
         //b)
         c2.sacar(100);
         System.out.println("c2: Saldo R$" + c2.getSaldo());
         
         //c)
         c2.transferir(100, c1);
         
         //e)
         System.out.println("c1: " + c1.getNumero());
         System.out.println("Titular" + c1.getTitular());
         System.out.println("Saldo R$" + c1.getSaldo());
         
         System.out.println("c2: " + c2.getNumero());
         System.out.println("Titular" + c2.getTitular());
         System.out.println("Saldo R$" + c2.getSaldo());
          
        }
     public static void main(String[] args) {
        new questao2.App();
    }
}


