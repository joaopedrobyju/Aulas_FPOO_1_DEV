/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author user
 */
public class Aula {
    public static void main(String[] args) {
    
    String cidade = "Piracicaba";
    
    int comprimento = cidade.length();
    
    System.out.println(cidade);
    System.out.println("Tem o tamanho de: " + comprimento + " Caracteres");
    
    String frases ="Minha " .concat("cidade ") .concat(cidade) .concat(" é muito linda");
        System.out.println(frases);
    
    String aluno = new String("Waldemir");
    double media = 5.5;
    String fraseAluno = String.format("O aluno %s tem média %.2f", aluno, media);
    System.out.println(fraseAluno);
    
    
    String idadePiracicaba = "256";
    
    int inteiro = Integer.parseInt(idadePiracicaba);
    
    String fraseIdade = String.format("A cidade %s tem %d anos ", cidade, inteiro);
    
        System.out.println(fraseIdade);
        
   
   String nome = "João Pedro Mendes";    
   int idade = 16;
   
   String stringIdade = Integer.toString(idade);
   
   String fraseMinhaIdade = String.format("Meu nome é %s e tenho %s anos ", nome, stringIdade);
    
   System.out.println(fraseMinhaIdade); 
   
   String meuNome = "João Mendes";
   String[] vetor = meuNome.split(" ");
   System.out.println(vetor[0] + " " + vetor[1]);
   
   String iniciais = String.format("Iniciais do meu nome: %s%s", 
           vetor[0].charAt(0),
           vetor[1].charAt(0));
   
        System.out.println(iniciais);
        
    
   String cidade1 = cidade.substring(0,4);
    
    
    String cidade2 = cidade.substring(cidade.length() - 4);
    
        System.out.println(cidade1);
        
        System.out.println(cidade2);
    
    String aniversario = "Feliz".toUpperCase() 
            .concat(" aniversario, muitas ") 
            .concat("felicidades" .toUpperCase()) 
            .concat(" e muita ") 
            .concat("saude" .toUpperCase());
    
        System.out.println(aniversario);
          
    }
}
