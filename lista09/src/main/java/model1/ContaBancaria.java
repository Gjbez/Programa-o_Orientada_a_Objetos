/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model1;

import java.util.ArrayList;

/**
 *
 * @author gbez
 */
public class ContaBancaria {
    
    private String numero;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Movimento> listamovimento;
    
    

     public ContaBancaria(String numero, double saldo, Cliente cliente, Movimento movimento) {
        listamovimento = new ArrayList<Movimento>();
        setNumero(numero);
        setSaldo(saldo);
        setCliente(cliente);
     }
    
    public void depositar (double valor) throws IllegalArgumentException{
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser "
                    + "depositado deve ser maior que 0!");
        }
        this.saldo += valor;
    }
    
    protected void sacar(double valor) throws IllegalArgumentException{
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser "
                + "sacado deve ser maior que 0!");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Sem limite para "
                    + "este saque. Saldo: R$" + getSaldo());
        }
        this.saldo -= valor;
    }
    
    public void transferir(ContaBancaria contaDestino, 
            double valor) throws IllegalArgumentException{
        
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta de destino"
                    + " invalida");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public void incluirMovimento(Movimento m) {
        if (m == null) {
            throw new IllegalArgumentException("Movimento deve ser informado");
        }
        listamovimento.add(m);
    }
    
    public void setNumero(String numero) {
        if(numero.isBlank()){
        throw new IllegalArgumentException("Número deve ser preenchido");
        }
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        if(saldo <= 0){
        throw new IllegalArgumentException("Apenas valores maiores que 0");
        }
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
        throw new IllegalArgumentException("Cliente deve ser informado"); 
        }
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Movimento> getListamovimento() {
        return listamovimento;
    }
    
}
