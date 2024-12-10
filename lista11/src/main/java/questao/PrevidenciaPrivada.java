/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao;

/**
 *
 * @author gbez
 */
public class PrevidenciaPrivada extends Investimento{
    
    private double valor;

    public PrevidenciaPrivada(double valor) {
        setValor(valor);
    }
    

    @Override
    public double calcularValorPagar() {
        return valor;
    }
    
    public void investir(double valor, double saldo){
     this.valor += valor;
    }
    
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
}
