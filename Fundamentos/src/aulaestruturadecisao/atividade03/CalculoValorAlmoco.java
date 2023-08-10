package aulaestruturadecisao.atividade03;

import java.util.Scanner;

public class CalculoValorAlmoco {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a opcao do seu prato:"
                + "\nBife acebolado(1)"
                + "\nFilé de Frango(2)"
                + "\nBrajola(3)");
        int nomeOpcoes = scanner.nextInt();
        
        System.out.println("Informe a quantidade de pratos ");
        int qtdeDePratos = scanner.nextInt();
       
        double valorPrato = 0;
        double valorConta;
        
        if (nomeOpcoes == 1) {
        valorPrato = 19.99;
        valorConta = valorPrato * qtdeDePratos;
            System.out.println("O valor do almoco sera de: R$" + valorConta);
        } else if (nomeOpcoes == 2){
           valorPrato = 18.99;
           valorConta = valorPrato * qtdeDePratos;
            System.out.println("O valor do almoco sera de: R$" + valorConta);
        } else if (nomeOpcoes == 3){
            valorPrato = 23.99;
           valorConta = valorPrato * qtdeDePratos;
            System.out.println("O valor do almoco sera de: R$" + valorConta);
        }
    }
}