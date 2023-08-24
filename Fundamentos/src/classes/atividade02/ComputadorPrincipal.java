/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade02;

/**
 *
 * @author Aluno
 */
public class ComputadorPrincipal {
    public static void main(String[] args) {
        Computador computador01 = new Computador(500, "Windows", MemoriaEnum.OITO_GIGAS.getMemorias(), ProcessadorEnum.INTEL_I7.getProcessador());
        System.out.println(computador01);
        
        System.out.println("-----------------------------");
        computador01.ApagarArquivo(300);
        System.out.println(computador01);
        
        System.out.println("------------------------------");
        computador01.InstalarArquivo();
        System.out.println(computador01);
    }
}
