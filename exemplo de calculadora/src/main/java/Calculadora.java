/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class Calculadora {
    
    private int n1;
    
    /**
     * 
     */
    private int n2;
    
    /**
     * construtor da classe calculadora
     * 
     * @param n1 primeiro número da conta
     * @param n2 segundo número da conta
     */
    public Calculadora(int n1, int n2){
    setn1(n1);
    setn2(n2);
    }
    
    /**
     * altera valor de n1
     * @param n1 
     */
    public void setn1(int n1){
       this.n1 = n1;
    }
    
    public void setn2(int n2){
       this.n2 = n2;
    }
    
    public int getn1(){
    return n1;
    }
    
    public int getn2(){
    return n2;
    }
    
    /**
     * soma dos atributos
     * @return 
     */
    public int somar(){
    return getn1() + getn2();
    }
}
