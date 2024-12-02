package com.postofm.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    //Atributos
    private LocalDate data;
    private List<Bomba> bombas = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();


    //Getters and Setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public List<Bomba> getBombas() {
        return bombas;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    //Metodo para adicionar bomba na lista
    public void adicionarBomba(Bomba b){
        this.bombas.add(b);
    }

    //Metodo para adicionar funcionarios
    public void adicionarFuncioanrio(Funcionario f){
        this.funcionarios.add(f);
    }

    //Metodo para calcular valor total vendido
    public Double calcularTotalVendido(){
        Double total = 0.0;
        for (Bomba b : this.bombas){
            total = total+b.calcularValorTotal();
        }
        return total;
    }

    //Metodo para gerar relatorio
    public void gerarRelatorio(){
        System.out.println("Relatorio de vendas da data "+this.getData());
        System.out.println("");
        System.out.println("Equipe: ");

        for (Funcionario f : this.funcionarios){
            System.out.println(f.getNome());
        }

        System.out.println("Relatorio das bombas");

        for (Bomba b : this.bombas){
            System.out.println("Bomba "+b.getID());
            System.out.println(b.getTipo().getNome() +" - valor: "+b.getTipo().getValor());
            System.out.println("Litros vendidos: "+b.calcularMetragem());
            System.out.println("Total vendido: "+b.calcularValorTotal());
        }

        System.out.println("Valor total vendido: "+this.calcularTotalVendido());
    }

}
