package atividade01;
import atividade01_classes.Multa;
import java.util.Scanner;
public class PagamentoMulta {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Informe a marca de seu veículo: ");
         String nomeCarro = scanner.next();
         
         System.out.println("Informe a velocidade de seu veiculo: ");
         int velocidadeCarro = scanner.nextInt();
         
         System.out.println("Informe a quantidade que excedeu o valor limite: ");
         int valorPorKm = scanner.nextInt();
         
         Multa multa = new Multa(velocidadeCarro);
         
         char pagMulta = scanner.next().charAt(0);
         
         if (pagMulta == 80){
             double valorTotal = multa.ValorTotal();
             double valorTotalMulta = multa.ValorTotalComMulta();
             if (valorTotal < 80){
                 System.out.println("Você não foi multado");
             } else{
                 System.out.println("Você foi multado" + valorTotalMulta);
             }
         }
         
     
         
         
         
    }
    
   
    
}
