package atividade01;
import atividade01_classes.Salario;
import java.util.Scanner;
public class ModificacaoSalario {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("Informe seu nome: ");
         String nomeFuncionario = scanner.next();
         
         System.out.println("Informe seu salario: ");
         double salarioFuncionario = scanner.nextDouble();
         
         Salario salario = new Salario(nomeFuncionario, salarioFuncionario);
         double aumento = salario.CalcularModificacaoSalario();
         double novoSalario = salarioFuncionario + aumento;
         
         System.out.printf("O valor do aumento e de: R$ " + aumento);
         System.out.printf("O valor do novo salario e de: R$ " + novoSalario);
         
    }
   


}
