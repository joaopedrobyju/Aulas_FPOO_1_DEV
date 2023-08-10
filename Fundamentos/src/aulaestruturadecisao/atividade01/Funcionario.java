package aulaestruturadecisao.atividade01;

public class Funcionario {
    
    String cargo;
    double salario;
    int INSS;
    double convenio;
    double salarioTotal;
    double salarioDescontoINSS;
    public Funcionario(String cargo, double salario, int INSS, double convenio) {
        this.cargo = cargo;
        this.salario = salario;
        this.INSS = INSS;
        this.convenio = convenio;
    }
    
    
   
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getINSS() {
        return INSS;
    }

    public void setINSS(int INSS) {
        this.INSS = INSS;
    }

    public double getConvenio() {
        return convenio;
    }

    public void setConvenio(double convenio) {
        this.convenio = convenio;
    }
    
    public double CalcularDescontoINSS(){
        this.salarioDescontoINSS = this.salario * (this.INSS / 100.0);
        return (int) this.salarioDescontoINSS;
    }
     
    public double CalcularSalarioTotal(){
        this.salarioTotal = salario -  salarioDescontoINSS - convenio;
        return this.salarioTotal;
    }
}

