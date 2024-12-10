package questao4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import javax.swing.JOptionPane;
import questao1.Retangulo;

/**
 *
 * @author gbez
 */
public class AppQuestao3Ui {
    
    
    public AppQuestao3Ui(){
        boolean certo = false;
        do{
        try{
        int altura = Integer.parseInt(JOptionPane.showInputDialog("altura:"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento:"));
    
        Retangulo retangulo = new Retangulo(altura, comprimento);
        
        JOptionPane.showMessageDialog(null, "Área = " + retangulo.calcularArea() + "\nPerimetro = " + retangulo.calcularPerimetro());
        certo = true;
        }
        catch(IllegalArgumentException e){
          JOptionPane.showMessageDialog(null, e.getMessage());
        }
       } while(!certo);
    
    }
    public static void main(String[] args){
        new AppQuestao3Ui();
    }
}
