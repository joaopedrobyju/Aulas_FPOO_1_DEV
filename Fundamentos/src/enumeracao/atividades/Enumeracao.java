/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    public static void main(String[] args) {
        Meses meses = new Meses(3, MesesEnum.MARÇO.getSatus());
        System.out.println(meses);
        Meses meses01 = new Meses(5, MesesEnum.MAIO.getSatus());
        System.out.println(meses01);
        Meses meses02 = new Meses(8, MesesEnum.AGOSTO.getSatus());
        System.out.println(meses02);
        
        Livros livro = new Livros("Harry Potter", 67.90, 1, LivrosEnum.FICCAO.getStatus());
        System.out.println(livro);
        
        
        Cantina cantina = new Cantina("Coxinha", 8.99, 2, CantinaEnum.COXINHA.getStatus());
        System.out.println(cantina);
         Cantina cantina01 = new Cantina("Esfiha", 8.99, 1, CantinaEnum.ESFIHA.getStatus());
        System.out.println(cantina01);
         Cantina cantina02 = new Cantina("Suco de Laranja", 15.99, 3, CantinaEnum.SUCO_LARANJA.getStatus());
        System.out.println(cantina02);
        
        RedesSociais redeSocial = new RedesSociais(RedesSociasEnum.JOGOS.getStatus());
        System.out.println(redeSocial);
        RedesSociais redeSocial01 = new RedesSociais(RedesSociasEnum.STREAMING.getStatus());
        System.out.println(redeSocial01);
        RedesSociais redeSocial02 = new RedesSociais(RedesSociasEnum.NOTICIAS.getStatus());
        System.out.println(redeSocial02);
    }
}
