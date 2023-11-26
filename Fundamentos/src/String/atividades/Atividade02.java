/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String.atividades;

/**
 *
 * @author user
 */
public class Atividade02 {
    public static void main(String[] args) {
    String endereco = "Rua Fernando Souza Costa";
    String bairro = "Paulista";
    int numero = 3003;
    
    String mensagem = String.format("Moro no bairro %s na %s no numero %d", bairro,endereco,numero);
        System.out.println(mensagem);
        
        
   String[] partes = endereco.split(" ");  
   String mensagem2 = String.format("Iniciais do meu endereco: %s%s%s%s", 
           partes[0].charAt(0),
           partes[1].charAt(0),
           partes[2].charAt(0),
           partes[3].charAt(0));
   
   String inicias = String.valueOf(partes[0].charAt(0))
                    .concat(String.valueOf(partes[1].charAt(0)))
                    .concat(String.valueOf(partes[2].charAt(0)))
                    .concat(String.valueOf(partes[3].charAt(0)));
   
        System.out.println(mensagem2);
    }

}
