/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Cantina {
    private String produto;
    private double valor;
    private int qtde_itens;
    private String itens;

    public Cantina(String produto, double valor, int qtde_itens, String itens) {
        this.produto = produto;
        this.valor = valor;
        this.qtde_itens = qtde_itens;
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Cantina{" + "produto=" + produto + ", valor=" + valor + ", qtde_itens=" + qtde_itens + ", itens=" + itens + '}';
    }
    
    
    
    

    
    
    
    
}
