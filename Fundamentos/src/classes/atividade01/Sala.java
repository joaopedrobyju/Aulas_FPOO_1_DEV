/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade01;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numoeroCadeiras;
    private int numeroMesas;
    private int numeroSalas;
    private boolean temProjetor;
    private int numeroComputadores;
    private String situacao;
    private int adicionarCad;

    public Sala(int numoeroCadeiras, int numeroMesas, int numeroSalas, boolean temProjetor, int numeroComputadores) {
        this.numoeroCadeiras = numoeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSalas = numeroSalas;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.situacao = "Nada";
        this.adicionarCad = 0;
    }
    
    
    public void adicionarCadeira(int adicionarCad){
        this.situacao = "Novo aluno entrou na sala";
        this.adicionarCad = adicionarCad;
    }
    
    public void removerCadeira(){
        this.situacao = "Aluno saiu da sala";
        this.adicionarCad -= 1;
    }

    public Sala(int numoeroCadeiras, int numeroMesas, int numeroSalas, boolean temProjetor, int numeroComputadores, String situacao, int adicionarCad) {
        this.numoeroCadeiras = numoeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSalas = numeroSalas;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.situacao = situacao;
        this.adicionarCad = adicionarCad;
    }

    @Override
    public String toString() {
        return "Sala{" + "numoeroCadeiras=" + numoeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSalas=" + numeroSalas + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + ", situacao=" + situacao + ", adicionarCad=" + adicionarCad + '}';
    }

    
    
    
    
    
    
    
}
