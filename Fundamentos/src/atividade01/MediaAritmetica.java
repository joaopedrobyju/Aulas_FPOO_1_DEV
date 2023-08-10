package atividade01;
import java.util.Scanner;
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
