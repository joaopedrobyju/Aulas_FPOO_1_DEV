/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Livros {
    
    private String nome_livro;
    private double valor;
    private int qtde_livros;
    private LivrosEnum generos_livro;

    public Livros(String nome_livro, double valor, int qtde_livros, LivrosEnum generos_livro) {
        this.nome_livro = nome_livro;
        this.valor = valor;
        this.qtde_livros = qtde_livros;
        this.generos_livro = generos_livro;
    }

    @Override
    public String toString() {
        return "Livros{" + "nome_livro=" + nome_livro + ", valor=" + valor + ", qtde_livros=" + qtde_livros + ", generos_livro=" + generos_livro + '}';
    }

    
    
    
    
}
