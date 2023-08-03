package atividade01_classes;

public class Pagamento {
    String nome;
    double valor;
    int qtdeProduto;
    double valorTotal;


    public Pagamento(String nome, double valor, int qtdeProduto) {
        this.nome = nome;
        this.valor = valor;
        this.qtdeProduto = qtdeProduto;
    }

    public double CalcularValorTotal(){
        this.valorTotal = this.valor * this.qtdeProduto;
        return this.valorTotal;
    }
    
}
