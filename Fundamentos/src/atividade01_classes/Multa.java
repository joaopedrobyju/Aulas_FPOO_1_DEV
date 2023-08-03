package atividade01_classes;

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
