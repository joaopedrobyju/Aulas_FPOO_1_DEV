/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import javax.xml.transform.Source;

/**
 *
 * @author Aluno
 */
public class RedesSociais {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Posts p1 = new Posts("Receitas de Bolos", "Como fazer um bolo de cenoura", "Muito legal esse post, muito bem explicado");
        System.out.println(p1);
       
        int estrelasPostLegal = p1.PostsLegais();
        System.out.println("o post tem: " + estrelasPostLegal + " estrelas");
        
        System.out.println("------------------------------------------------------------");
        
        Posts p2 = new Posts("Notícias de Futebol","O São Paulo decidirá em casa a Final contra o Flamengo", "Muito legal, vamos São Paulo");
        System.out.println(p2);
        
        int estrelasPostSuperLegal = p2.PostsSuperLegais();
        System.out.println("O post tem: " + estrelasPostSuperLegal + " estrelas");
        
        System.out.println("------------------------------------------------------------");
        
        Posts p3 = new Posts("Notícias de Piracicaba", "Piracicaba tem o melhor ensino do Brasil", "A notícia é boa, porém o design e a fonte das palavras é bem ruim");
        System.out.println(p3);
        
        int estrelasPostComum = p3.PostsComuns();
        System.out.println("O post tem: " + estrelasPostComum + " estrelas");
        
        
    }
}
