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
        Carro golf = new Carro("Golf", "Preto","Volkswagen", 2000, 4);
        
        golf.andar(50);
        golf.andar(100);
        
        golf.freiar(50);
        
        System.out.println(golf);
    }
}
