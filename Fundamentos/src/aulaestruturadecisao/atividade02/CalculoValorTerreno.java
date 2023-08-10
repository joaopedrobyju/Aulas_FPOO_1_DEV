package aulaestruturadecisao.atividade02;
import java.util.Scanner;
import aulaestruturadecisao.atividade02.Terreno;

public class CalculoValorTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a largura do terreno: ");
        double valorLargura = scanner.nextDouble();
        
        System.out.println("Informe o comprimento do terreno: ");
        double valorComprimento = scanner.nextDouble();
        
        System.out.println("Informe o valor por Metro: ");
        double valorPorMetro = scanner.nextDouble();
        
       Terreno terreno = new Terreno(valorLargura, valorComprimento, valorPorMetro);
        
        double valorTotal = terreno.CalcularValorTotal();
        double areaTotal = terreno.CalcularAreaTotalTerreno();
        
        
        if (valorTotal <= 200) {
            System.out.println(" A area total do terreno e de: " + areaTotal + " \n O valor total do terreno e de: " + valorTotal);
        } else if (valorTotal <= 350) {
            System.out.println( "A area total do terreno e de: " + areaTotal + " \n O valor total do terreno e de: " + valorTotal);
        } else if (valorTotal >= 350) {
            System.out.println(" A area total do terreno e de: " + areaTotal + " \n O valor total do terreno e de: " + valorTotal);
        }
    }
}
