/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author gbez
 */
public abstract class Pessoa {

    private String nome;
    private int cpf;
    private Date dataNascimento;
    
    public Pessoa(String nome, int cpf, Date dataNascimento) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null && nome.trim().equals("")) {
        throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if (cpf == 0) {
        throw new IllegalArgumentException("Cpf deve conter numeros positivos");
        }
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        if (dataNascimento == null) {
        throw new IllegalArgumentException("A data de nasicmento não pode ser vazio");
        }
        this.dataNascimento = dataNascimento;
    } 
}
