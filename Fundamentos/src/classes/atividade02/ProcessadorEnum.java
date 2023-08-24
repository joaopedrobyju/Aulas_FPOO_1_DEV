/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade02;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    INTEL_I5("Intel i5 Geração 10"),
    INTEL_I7("Intel i7 Geração 12"),
    INTEL_I3("Intel i3 Geração 13"),
    RYZEN_5("Ryzen 5 Geração 5"),
    RYZEN_7("Ryzen 7 Geração 6"),
    RYZEN_9("Ryzen 9 Geração 7");
    
    private String processador;
    
    private ProcessadorEnum(String processador){
        this.processador = processador;
    }
    
    public String getProcessador(){
        return this.processador;
    }
    
}
