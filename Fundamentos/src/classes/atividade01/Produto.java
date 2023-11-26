/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade01;

/**
 *
 * @author user
 */
public class Produto {
    String nome;
    double valor;
    int qtdeProduto;
    double valorTotal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public Produto(String nome, double valor, int qtdeProduto) {
        this.nome = nome;
        this.valor = valor;
        this.qtdeProduto = qtdeProduto;
    }

    public double CalcularValorTotal(){
        this.valorTotal = this.valor * this.qtdeProduto;
        return this.valorTotal;
    }
}
