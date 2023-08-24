/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade01;

/**
 *
 * @author Aluno
 */
public class SalaPrincipal {
    public static void main(String[] args) {
        Sala sala01 = new Sala(30, 6, 10, true, 30);
        System.out.println(sala01);
        
        System.out.println("-------------------------");
        sala01.adicionarCadeira(31);
        System.out.println(sala01);
    }
}
