package com.postofm.models;

public enum Tipo {
    GASOLINA(5.80, "Gasolina"),
    ETANOL(4.80, "Etanol"),
    DIESEL(3.60, "Diesel");

    private Double valor;
    private String nome;

    //Construtor
    Tipo(Double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    //Getters and Setters
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
