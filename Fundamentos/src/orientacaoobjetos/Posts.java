/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public class Posts implements ClassificacaoPosts{
    private String titulo;
    private String descricao;
    private String comentarios;

    public Posts(String titulo, String descricao, String comentarios) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Posts{" + "titulo=" + titulo + ", descricao=" + descricao + ", comentarios=" + comentarios + '}';
    }
    
    
    
    

    public int PostsComuns(){
        return COMUK;
    }
    
    public int PostsLegais(){
        return LEGAL;
    }
    
    public int PostsSuperLegais(){
        return SUPER_LEGAL;
    }
    
    
    
}
