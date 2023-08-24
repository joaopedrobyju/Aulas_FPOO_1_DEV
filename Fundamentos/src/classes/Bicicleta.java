/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    //São os atributos, que mostram as características das Classes
    private int qtdeRodas;
    private boolean temMarchas;
    private int marchas;
    private String modelo;
    private String cor;
    private boolean temFreio;
    private String situacao;
    private int velocidade;
    
    //Construtor sem argumentos
    public Bicicleta() {
    }
    
    
    //Construtor com argumentos
    public Bicicleta(int qtdeRodas, boolean temMarchas, int marchas, String modelo, String cor, boolean temFreio) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.marchas = marchas;
        this.modelo = modelo;
        this.cor = cor;
        this.temFreio = temFreio;
        this.situacao = "Parada";
        this.velocidade = 0;
    }

    
    //Ações da Bicicleta
    public void andar(int velocidade){
        this.situacao = "andando";
        this.velocidade = velocidade;
    }
    
    public void freiar(int velocidade){
        this.situacao = "freiando";
        this.velocidade = velocidade;
    }
    
    public boolean verificarFreio(){
        return this.temFreio;
        
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", temMarchas=" + temMarchas + ", marchas=" + marchas + ", modelo=" + modelo + ", cor=" + cor + ", temFreio=" + temFreio + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    

   
    
    
   
    
    
    
    
    
    
    
}
