/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum RedesSociasEnum {
    
    NOTICIAS("Noticias"), 
    STREAMING("Streaming"),
    MENSAGENS("Mensagens"), 
    VIDEOS("Videos"), 
    JOGOS("Jogos");
    
    private String redes_social;
    
    private RedesSociasEnum(String redes_social){
        this.redes_social = redes_social;
    }
    
    public String getStatus(){
        return this.redes_social;
    }
}
