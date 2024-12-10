/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gbez
 */
public class ContaEspecial extends ContaBancaria{
    
    private double limiteCredito;

   /* public ContaEspecial(String numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }*/

    
    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito <= 0){
        throw new IllegalArgumentException("Apenas valores maiores que 0");
        }
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void sacar(double valor) throws IllegalArgumentException{
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser "
                + "sacado deve ser maior que 0!");
        }
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Sem limite para "
                    + "este saque. Saldo: R$" + getSaldo());
        }
        if (valor > limiteCredito) {
            throw new IllegalArgumentException("Passou do limite");         
        } 
        setSaldo(getSaldo() - valor);
      }
        
}