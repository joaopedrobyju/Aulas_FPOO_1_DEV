/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private corEnum cor;
    private String marca;
    private int anoFabricacao;
    private int qtdeRodas;
    private boolean estaEmRe;
    private int marcha;
    private String situacao;
    private int velocidade;

    public Carro(String modelo, corEnum cor, String marca, int anoFabricacao, int qtdeRodas, int marcha) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.qtdeRodas = qtdeRodas;
        this.marcha = marcha;
    }

    public void setCor(corEnum cor) {
        this.cor = cor;
    }
    
    public void trocarDeMarcha(MarchaEnum novaMarcha){
        int diferenca = novaMarcha.getNumerosMarchas() - this.marcha;
        
        if(diferenca == 1){
             this.marcha = novaMarcha.getNumerosMarchas();
        } else {
            System.out.println("Voce não pode pular a marcha");
        }
       
    }
    
    public void engatarRe(boolean re){
        this.estaEmRe = re;
    }
    
    
    
    public void andar(int velocidade){
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void freiar(int velocidade){
        this.situacao = "Freiando";
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", qtdeRodas=" + qtdeRodas + ", marcha=" + marcha + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    

    
    
    
}
