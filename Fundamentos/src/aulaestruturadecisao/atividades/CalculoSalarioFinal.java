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
public class CalculoSalarioFinal {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o seu cargo: ");
        String nomeCargo = scanner.next();
        
        System.out.println("Informe o valor de seu salario: ");
        double valorSalario = scanner.nextDouble();
        
        System.out.println("Informe o deconto do INSS: ");
        int valorINSS = scanner.nextInt();
        
        System.out.println("Informe o valor de seu convenio: ");
        int valorConvenio = scanner.nextInt();
        
        Funcionario funcionario = new Funcionario(nomeCargo, valorSalario, valorINSS, valorConvenio);
        
        double valorTotal = funcionario.CalcularSalarioTotal();
        
        if (valorTotal <= 2345) {
            System.out.println(" O salario de Auxiliar e de: " + valorTotal);
        } else if (valorTotal <= 3789) {
            System.out.println("O salario de Tecnico e de: " + valorTotal);
        } else if (valorTotal <= 4128) {
            System.out.println("O salario de Supervisor e de: " + valorTotal);
        } else if(valorTotal <= 5590) {
            System.out.println("O salario de Gerente e de: " + valorTotal);
        }   
    }
}
