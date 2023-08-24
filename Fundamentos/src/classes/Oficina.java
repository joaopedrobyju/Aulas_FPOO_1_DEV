/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Oficina {
    public static void main(String[] args) {
        Carro golf = new Carro("Golfo", corEnum.ROXO, "Volkswagen", 2010, 4, 0);
       
        
       golf.trocarDeMarcha(MarchaEnum.PREMEIRA_MARCHA);
        System.out.println(golf);
       golf.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        System.out.println(golf);
       golf.trocarDeMarcha(MarchaEnum.QUARTA_MARCHA);
        System.out.println(golf);
  
        
        System.out.println("-----------------------------------------------");
        golf.andar(50);
        golf.andar(100);
        
        golf.freiar(50);
        
        System.out.println(golf );
    }
}
