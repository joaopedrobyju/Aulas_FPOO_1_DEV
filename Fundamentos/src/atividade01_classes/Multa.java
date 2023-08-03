package atividade01_classes;

public class Multa {
    String nomeCarro;
    int velocidadeCarro;
    double valorTotalMulta;

    public Multa(int velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
        verificarMulta();
    }  
    private void verificarMulta(){
        if (velocidadeCarro > 80){
            
        }
    }
    public double ValorTotalComMulta(){
        this.valorTotalMulta = this.velocidadeCarro + (valorPorKm * 5);
        return this.valorTotalMulta;
    }
    
}
