/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum corEnum {
    ROXO("Roxo"),
    AZUL("Azul"),
    PRETO("Preto"),
    BRANCO("Branco"),
    PRATA("Prata"),
    LARANJA("Laranja");
    
    private String cores;
    
    private corEnum(String cores){
        this.cores = cores;
    }
    
    public String getCores(){
        return this.cores;
    }
}
