/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gbez
 */
public class ValorInvalidoException extends Exception {
   
    public ValorInvalidoException() {
        super("Valor deve ser maior que zero!");
    }
}
