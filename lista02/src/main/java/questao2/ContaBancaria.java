/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author gbez
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;


    /**
     * Permite ler o atributo do número
     * @return 
     */
    public String getNumero(){
        return numero;
    }

    /**
     * Permite alterar o número da conta
     * @param numero valor do número da conta
     */
    public void setNumero(String numero){

        if (numero == null || numero.trim().equals("")){
            throw new IllegalArgumentException("Numero deve ser preenchido");
        }
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){

        if (titular == null || titular.trim().equals("")){
            throw new IllegalArgumentException("Titular deve ser preenchido");
        }
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Deve ser valor maior que zero");
        } 
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Deve ser valor maior que zero");
        } 
         if (valor <= this.saldo){
            throw new IllegalArgumentException("sem limite para esse saque. Saldo: R$" + getSaldo());
    }
         this.saldo -= valor;
    }

    public void transferir(double valor,ContaBancaria contaDestino ){
       
        if(contaDestino == null) {
        throw new IllegalArgumentException("conta de destino inválida");
        }
        
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


}

