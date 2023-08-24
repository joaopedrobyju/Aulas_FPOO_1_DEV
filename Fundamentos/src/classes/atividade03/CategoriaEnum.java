/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade03;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    ADM("Admninistração"),
    DEV("Desenvolvimento de Sistemas"),
    ELETRONICA("EletroEletrônica"),
    QUALIDADE("Qualidade"),
    SOLDA("Solda");
    
    private String cursos;
    
    private CategoriaEnum(String cursos){
        this.cursos = cursos;
    } 
    
    public String getCursos(){
        return this.cursos;
    }
}
