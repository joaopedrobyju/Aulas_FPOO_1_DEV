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
    private String cor;
    private String marca;
    private int anoFabricacao;
    private int qtdeRodas;
    private String situacao;
    private int velocidade;

    public Carro(String modelo, String cor, String marca, int anoFabricacao, int qtdeRodas) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.qtdeRodas = qtdeRodas;
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
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", qtdeRodas=" + qtdeRodas + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
    
}
