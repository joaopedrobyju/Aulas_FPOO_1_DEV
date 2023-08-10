package aulaestruturadecisao;

public class elseif {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            System.out.println("Está ficando frio");
        } else if (temperatura == 20){
            System.out.println("Está agradável");
        } else if (temperatura == 30){
            System.out.println("Está ficando calor");
        } 
        
        switch (temperatura) {
            case 15:
                System.out.println("Está ficando frio");
                break;
            case 20:
                System.out.println("Está agradável");
                break;
            case 30:
                System.out.println("Está ficando calor");
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
}
