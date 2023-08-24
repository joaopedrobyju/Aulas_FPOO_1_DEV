/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade03;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descircao;
    private String cursos;
    private String situacao;
    private int anosCurso;

    public Curso(String nome, String descircao, String cursos) {
        this.nome = nome;
        this.descircao = descircao;
        this.cursos = cursos;
        this.situacao = "Nada";
        this.anosCurso = 0;
    }
    
    
    
    
    public void Aprovado(int anosCurso){
        this.situacao = "Você está aprovado";
        this.anosCurso = anosCurso;
    }
    
    public void Reprovado(int anosCurso){
        this.situacao = "Você está reprovado";
        this.anosCurso = anosCurso;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descircao=" + descircao + ", cursos=" + cursos + ", situacao=" + situacao + ", anosCurso=" + anosCurso + '}';
    }
    
    
    
    
}
