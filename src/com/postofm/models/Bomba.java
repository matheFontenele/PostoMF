package com.postofm.models;

public class Bomba {
    //Atributos
    private int ID;
    private Tipo tipo;
    private Long metragemInical;
    private Long metragemFinal;
    private Double valorTotal;

    //Getters and Setters
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public Long getMetragemInical() {
        return metragemInical;
    }
    public void setMetragemInical(Long metragemInical) {
        this.metragemInical = metragemInical;
    }
    public Long getMetragemFinal() {
        return metragemFinal;
    }
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setMetragemFinal(Long metragemFinal) {
        this.metragemFinal = metragemFinal;
    }

    //Metodo para calcular metragem da bomba
    public Long calcularMetragem(){
        return getMetragemFinal() - getMetragemInical();
    }

    //Metodo para calcular valor total
    public Double calcularValorTotal(){
        return calcularMetragem() * tipo.getValor();
    }

}


