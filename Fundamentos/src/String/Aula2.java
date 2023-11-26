/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author user
 */
public class Aula2 {
    public static void main(String[] args) {
        String escola = "Senai Mario Henrique Simonsen";
        
        System.out.println(escola.length());
        
        int idadeSenai = 41;
        
        String mensagem = String.format("A escola %s tem %d anos de idade", escola,idadeSenai);
        
        System.out.println(mensagem);
        
        char primerioCaractere = escola.charAt(0);
        System.out.println(primerioCaractere);
        
        String[] partes = escola.split(" ");
        
        System.out.println(partes[0]);
        
        String cidade = "Piracicaba";
        System.out.println(cidade.toUpperCase());
        System.out.println(cidade.toLowerCase());
        
        String alterado = cidade.replace("a", "z");
        
        System.out.println(alterado);
        System.out.println(cidade.replaceFirst("a", "Z"));
        
        String texto = "Ola, seja be vindo ao Senai";
        
        boolean contemSenai = texto.contains("Senai");
        System.out.println(contemSenai);      
        
    }
}
