package atividade01_classes;

public class Salario {
String nome;
double salario;
double valorTotal;

    public Salario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double CalcularModificacaoSalario(){
        if (this.salario > 1350) {
            this.valorTotal = this.salario + (this.salario * 1.0)
        } else {
        }
    }
}
