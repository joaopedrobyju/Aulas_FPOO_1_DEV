package atividade01;
import java.util.Scanner;
import atividade01_classes.Pagamento;

public class PagamentoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nomeProduto = scanner.next();
        
        System.out.println("Informe o preço: ");
        double valorProduto = scanner.nextDouble();
        
        System.out.println("Informe a quantidade: ");
        int qtdeProdutos = scanner.nextInt();
        
        Pagamento produto = new Pagamento(nomeProduto, valorProduto, qtdeProdutos);
        
        System.out.println("Informe a forma de pagamento: ");
        char formaPag = scanner.next().charAt(0);
        
        if (formaPag == 'D') {
            double valorTotal = produto.CalcularValorTotal();
            if (valorTotal <= 100.0) {
                valorTotal *= 0.95;
        } else {
                valorTotal*= 0.97;
            }
            System.out.println("");
            System.out.println("O valor total com desconto é de: " + valorTotal);
          
        }
        if (formaPag == 'C') {
            System.out.println("Sua compra será dividida em quantas parcelas?");
            int numeroParcelas = scanner.nextInt();
            double valorTotal = produto.CalcularValorTotal();
            double valorParcela = valorTotal / numeroParcelas;
            
            System.out.println("");
            System.out.println("Valor da parcela: R$: " + valorParcela);
        }
        
        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor total: R$ " + produto.CalcularValorTotal());
    }
}
