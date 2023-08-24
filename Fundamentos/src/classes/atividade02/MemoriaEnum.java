/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade02;

/**
 *
 * @author Aluno
 */
public enum MemoriaEnum {
    OITO_GIGAS("Oito Gigas"),
    DEZESSEIS_GIGAS("Dezesseis Gigas"),
    TRINTA_DOIS_GIGAS("Trinta e Dois Gigas"),
    SESSENTA_QUATRO_GIGAS("Sessenta e Quatro Gigas");
    
    private String memorias;
    
    
    private MemoriaEnum(String memorias){
        this.memorias = memorias;
    }
    
    public String getMemorias(){
        return memorias;
    }
    


}
