package atividade01;
import atividade01_classes.Multa;
import atividade01_classes.Veiculo;
import java.util.Scanner;
public class PagamentoMulta {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         try {
         System.out.println("Informe a velocidade de seu veiculo: ");
         int velocidadeCarro = scanner.nextInt();
         Veiculo veiculo = new Veiculo(velocidadeCarro);
          Multa multa = new Multa();
         
         double valorMulta = multa.ValorTotalComMulta(veiculo.getVelocidade());
          
         if (valorMulta > 0){
                 System.out.printf("Você foi multado! Valor da multa: R$ %.2f\n", valorMulta);
             } else{
                 System.out.println("Você não foi multado");
             }

        } catch (Exception e) {
            System.out.println("Valor invalido. Digite um número válido");
        } finally {
            scanner.close();
        }
}
}
