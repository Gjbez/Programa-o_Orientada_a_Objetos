/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;


import javax.swing.JOptionPane;
import questao1.Retangulo;

/**
 *
 * @author gbez
 */
public class AppQuestao2Ui {
    
    
    public AppQuestao2Ui(){
        Retangulo retangulo = new Retangulo();
        int altura = Integer.parseInt(JOptionPane.showInputDialog("altura:"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento:"));
    
        retangulo.setAltura(altura);
        retangulo.setComprimento(comprimento);
        
        JOptionPane.showMessageDialog(null, "Área = " + retangulo.calcularArea() + "\nPerimetro = " + retangulo.calcularPerimetro());
    
    
    }
    public static void main(String[] args){
        new AppQuestao2Ui();
    }
}
