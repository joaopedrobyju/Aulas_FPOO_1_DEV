/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade01;

/**
 *
 * @author user
 */
public class Multa {
    private int limiteVelocidadeCarro = 80 ;
   private  double valorporKm = 5.0;

    public double ValorTotalComMulta(double velocidade){
       if (velocidade > limiteVelocidadeCarro) {
           double kmAcima = velocidade - limiteVelocidadeCarro;
           return kmAcima * valorporKm;
       } else {
           return 0;
       }
    }
}
