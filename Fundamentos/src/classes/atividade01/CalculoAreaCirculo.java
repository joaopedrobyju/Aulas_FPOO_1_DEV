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
public class CalculoAreaCirculo {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor do Raio: ");
        double raio = scanner.nextDouble();
        
        double areaCirculo = pi * (raio * raio);
        
        System.out.println("A area total do circulo e: " + areaCirculo);
                
       
        
    }
}
