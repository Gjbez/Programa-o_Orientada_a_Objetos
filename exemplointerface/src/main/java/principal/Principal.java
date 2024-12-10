/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import modelo.Circulo;
import modelo.FormaGeometrica;
import modelo.Quadrado;
import modelo.Retangulo;
import modelo.ValorInvalidoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gbez
 */
public class Principal {
    
    public Principal() {
        try {
            ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
            formas.add(new Circulo(5));
            formas.add(new Quadrado(2));
            formas.add(new Retangulo(4, 5));
            
            String dados = "";
            
            for (FormaGeometrica forma: formas) {
                dados += forma.getClass().getSimpleName() + "\n";
                dados += forma.area() + " - " + forma.perimetro() + "\n";
            }
            
            JOptionPane.showMessageDialog(null, dados); 
            formas.add(new Circulo(0));
        } catch (ValorInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()); 
        }
    }
    
    public static void main(String[] args) {
        new Principal();
    }
}
