/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao;

import java.util.ArrayList;

/**
 *
 * @author gbez
 */
public class Contas {
    
    private ArrayList<Pagavel> pagavel;
    
    
    public void incluirConta(Pagavel contas){
        if (contas == null) {
            throw new IllegalArgumentException("Conta inexistente");
        }
    }
        
    public double calcularTotalContas(){
       double contatotal = 0;
    for (Pagavel p: pagavel) {
            contatotal += p.calcularValorPagar();
        }
        return contatotal;
    }
    
    public ArrayList<Pagavel> getContas(){
    return pagavel;
    }
}

