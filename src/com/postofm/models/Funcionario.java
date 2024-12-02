package com.postofm.models;

public class Funcionario {
    //Atributos
    private String nome;
    private Turno turno;

    //Construtor
    public Funcionario(String nome, Turno turno) {
        this.nome = nome;
        this.turno = turno;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
