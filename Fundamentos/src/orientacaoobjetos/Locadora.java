/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente c1 = new Cliente("Ari Santos", "joao@gmail.com");
        System.out.println(c1);
        System.out.println("-------------------------------------------");
        double valorLocacaoSimples = c1.CalcularLocacao(3);
        System.out.println("O valor para locação do filme " + "Simples é: " + valorLocacaoSimples);
        c1.verificarEmailDominioGoogle(c1.getEmail());
        System.out.println(c1);
        System.out.println("---------------------------------------------");
        
        Cliente c2 = new Cliente("Ari Santos");
        System.out.println(c2);
        System.out.println("--------------------------------------------");
        double valorLocacaoLancamento = c2.CalcularLocação(5, true);
        System.out.println("O valor de locação do filme " + "Lançamento é: " + valorLocacaoLancamento);
        c2.validarNome(c2.getNome());
        System.out.println(c2);

    }
}
