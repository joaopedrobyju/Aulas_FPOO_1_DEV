/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade01;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int qtdeValores = input.nextInt();
    
    double[] valores = new double[qtdeValores];
    
    for (int i = 0; i < qtdeValores; i++){
        System.out.println("Digite o valor: " + (i + 1) + ": ");
        valores[i] = input.nextDouble();
    }
    
    double media = calcularMedia(valores);
        System.out.println("A media aritmetica e: " + media);
    }


    
    public static void calcularMedia
    
}

