/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaestruturadecisao.atividades;

/**
 *
 * @author user
 */
public class Terreno {
    double largura;
double comprimento;
double valorPorM;
double valorTotal;
double areaTotal;

      public Terreno(double largura, double comprimento, double valorPorM) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorPorM = valorPorM;
    }
      
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getValorPorM() {
        return valorPorM;
    }

    public void setValorPorM(double valorPorM) {
        this.valorPorM = valorPorM;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
   
    public double CalcularAreaTotalTerreno(){
        this.areaTotal = this.comprimento * this.largura;
        return this.areaTotal;
    }
     public double CalcularValorTotal(){
        this.valorTotal = (this.comprimento * this.largura) * this.valorPorM;
        return (int) this.valorTotal;
    }
}
