/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String.atividades;

/**
 *
 * @author user
 */
public class Atividade01 {
     public static void main(String[] args) {
    String endereco = "Rua Fernando Souza Costa";
    String bairro = "Paulista";
    int numero = 3003;
    
    String mensagem = String.format("Moro no bairro %s na %s no numero %d", bairro,endereco,numero);
        System.out.println(mensagem);
    }
}
