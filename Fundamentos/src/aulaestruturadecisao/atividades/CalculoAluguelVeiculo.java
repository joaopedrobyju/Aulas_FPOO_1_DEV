/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaestruturadecisao.atividades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CalculoAluguelVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o carro desejado:"
                + "\nFiat Argo(1)"
                + "\nFiat Mobio(2)"
                + "\nHyundai Hb20 (3)");
        int nomeOpcoes = scanner.nextInt();
        
        System.out.println("Informe o valor do Km rodado: ");
        double valorPorKm = scanner.nextDouble();
       
        double valorDiaria = 0;
        double valorConta;
        
        
        if (nomeOpcoes == 1) {
        valorDiaria = 98.00;
        valorConta = valorDiaria * valorPorKm;
            System.out.println("O valor do alugel sera de: R$" + valorConta);
        } else if (nomeOpcoes == 2){
           valorDiaria = 79.00;
           valorConta = valorDiaria * valorPorKm;
            System.out.println("O valor do aluguel sera de: R$" + valorConta);
        } else if (nomeOpcoes == 3){
            valorDiaria = 102.00;
           valorConta = valorDiaria * valorPorKm;
            System.out.println("O valor do aluguel sera de: R$" + valorConta);
        }
    }
}
