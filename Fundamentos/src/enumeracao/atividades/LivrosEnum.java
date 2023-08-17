/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum LivrosEnum {
    
    FICCAO("Ficção"), 
    ROMANCE("Romance"),
    DRAMA("Drama"),
    SUSPENSE("Suspense"),
    TERROR("Terror"),
    AVENTURA("Aventura");
    
     private String livros;
     
     private LivrosEnum(String livros){
         this.livros = livros;
     }
     
     public String getStatus(){
         return this.livros;
     }
}
