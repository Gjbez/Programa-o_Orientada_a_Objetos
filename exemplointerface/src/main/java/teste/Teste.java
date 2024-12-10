/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author gbez
 */
public class Teste {

    public static void main(String[] args) throws IOException {
        File diretorio = new File("C:\\Users\\lpa\\Documents\\NetBeansProjects\\FormaGeometricaInterface");
        File[] conteudoDiretorio = diretorio.listFiles();
        for (File item : conteudoDiretorio) {
            if (item.isDirectory()) {
                System.out.println("Diretório: " + item.getName());
            } else {
                System.out.println("Arquivo " + item.getName()
                        + "tem " + item.length() + " bytes");
            }
        }
        
        diretorio = new File("C:\\Users\\lpa\\Documents\\NetBeansProjects\\FormaGeometricaInterface\\abc");
        diretorio.createNewFile();
    }
}
