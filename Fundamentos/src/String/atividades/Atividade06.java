/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String.atividades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Digite seu nome: " );
        String nome = scanner.next();
        System.out.println("Digite seu email: ");
        String email = scanner.next();
        
        String letras = nome.substring(0, 3)
                        .concat(email.substring(0, 5));
        
        System.out.println(letras);
        
        Random aleatorio = new Random();
        String senha = "";
        
        for (int i = 0; i < letras.length(); i++) {
            int posicao = aleatorio.nextInt(letras.length());
            String letrasSorteadas = String.valueOf(letras.charAt(posicao));
            
            senha += letrasSorteadas;
        }
        
        System.out.println("Sua senha eh: " + senha);
        
        scanner.close();     
    }
}
