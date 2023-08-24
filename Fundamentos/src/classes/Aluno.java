/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    
    private String nome;
    private String email;
    private int ra;
    private String situacao;
    private String situacao1;
    private String estudar;
    private String prova;

    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.situacao = "Nada";
        this.situacao1 = "Nada";
        this.estudar = "Nada";
        this.prova = "Nada";
    }

    
    public void estuda(String estudar){
        this.situacao = "Estudando";
        this.estudar = estudar;
    }
    
    public void fazerProva(String prova){
        this.situacao1 = "Fazendo Prova";
        this.prova = prova;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", situacao=" + situacao + ", situacao1=" + situacao1 + ", estudar=" + estudar + ", prova=" + prova + '}';
    }

    
    
    
}
