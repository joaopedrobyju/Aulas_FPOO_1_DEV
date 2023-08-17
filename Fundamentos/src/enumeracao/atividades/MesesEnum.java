/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

import javax.management.MBeanInfo;

/**
 *
 * @author Aluno
 */
public enum MesesEnum {
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"), 
    MARÇO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"), 
    SETEMEBRO("Setembro"),
    OUTUBRO("Outubro"), 
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");
    
    private String meses;

    private MesesEnum(String meses) {
        this.meses = meses;
    }
    
    public String getSatus(){
        return this.meses;
    }
    
    
    
}
