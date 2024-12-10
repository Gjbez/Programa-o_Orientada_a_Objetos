/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author gbez
 */
import java.util.Scanner;

public class App {
    public App(){
        
    Scanner o = new Scanner(System.in);
    
    System.out.println("Escreva nome");
    String nome = o.next();
    System.out.println("Escreva salario");
    double salario = o.nextDouble();
    
    Funcionario f1 = new Funcionario();
         f1.setNome(nome);
         f1.setSalario(salario);
         
    System.out.println("Escreva nome");
     nome = o.next();
    System.out.println("Escreva salario");
    salario = o.nextDouble();
    
    Funcionario f2 = new Funcionario();
         f2.setNome(nome);
         f2.setSalario(salario);
    
    System.out.println("c1: " + f1.getNome());
    System.out.println("Salario: " + f1.getSalario());
    System.out.println("Salario com imposto: " + f1.calcularIrpf(salario));
    
    System.out.println("c1: " + f2.getNome());
    System.out.println("Salario: " + f2.getSalario());
    System.out.println("Salario com imposto: " + f2.calcularIrpf(salario));
    }
     public static void main(String[] args) {
        new App();
 }
}

