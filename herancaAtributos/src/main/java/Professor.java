/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Date;

/**
 *
 * @author gbez
 */
public class Professor extends Pessoa {
    
    private int codigo;

    public Professor(String nome, int cpf, Date dataNascimento, int codigo) {
        super(nome, cpf, dataNascimento);
        setCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
        throw new IllegalArgumentException("Codigo deve ser maior que zero");
        }
        this.codigo = codigo;
    } 
}
