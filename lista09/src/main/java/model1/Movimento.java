/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model1;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gbez
 */
public class Movimento {
    
    private double valor;
    private TipoMovimento tipo;
    private LocalTime localtime;
    private LocalDate localdate;

    public Movimento(double valor, TipoMovimento tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    
    
    public double getValor() {
        if (valor <= 0) {
        throw new IllegalArgumentException("Valor deve ser maior que 0"); 
        }
        return valor;
    }
    
    public TipoMovimento getTipoMovimento(TipoMovimento tipoMovimento){
        return tipoMovimento;
    }
    
    public LocalDate getData(){
        return LocalDate.now();
    }
    
    public LocalTime getHora(){
        return LocalTime.now();
    }
}
