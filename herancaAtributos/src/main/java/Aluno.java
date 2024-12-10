/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Date;

/**
 *
 * @author gbez
 */
public class Aluno extends Pessoa {

    private int matricula;
    
    public Aluno(int matricula, String nomeAluno, int cpfAluno, Date dataNascimentoAluno) {
        super(nomeAluno, cpfAluno, dataNascimentoAluno);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matricula deve ser maior que zero");
        }
        this.matricula = matricula;
    }
    
    
    
}
