package atividade01_classes;

public class Salario {
String nome;
double salario;
double valorTotal;

    public Salario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double CalcularModificacaoSalario(){
        if (this.salario > 1350) {
            return this.salario * 0.10;
        } else {
            return this.salario * 0.15;
        }
    }
}
