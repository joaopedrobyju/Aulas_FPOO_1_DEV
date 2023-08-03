package atividade01;

import java.util.Scanner;

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
