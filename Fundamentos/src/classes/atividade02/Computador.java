/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade02;

/**
 *
 * @author Aluno
 */
public class Computador {
    private int capacidadeDiscoRigido;
    private String SistemaOperacional;
    private String memorias;
    private String processador;
    private String situacao;
    private int mudancaDiscoRigido;

    public Computador(int capacidadeDiscoRigido, String SistemaOperacional, String memorias, String processador) {
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.SistemaOperacional = SistemaOperacional;
        this.memorias = memorias;
        this.processador = processador;
        this.situacao = "Nada";
        this.mudancaDiscoRigido = 0;
        
    }

   
    public void ApagarArquivo(int mudancaDiscoRigido){
        this.situacao = "Apagando Arquivo";
        this.mudancaDiscoRigido = mudancaDiscoRigido;
    }
    
    public void InstalarArquivo(){
        this.situacao = "Baixando arquivo";
        this.mudancaDiscoRigido -= 50;
    }

    public void setCapacidadeDiscoRigido(int capacidadeDiscoRigido) {
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
    }

    public void setSistemaOperacional(String SistemaOperacional) {
        this.SistemaOperacional = SistemaOperacional;
    }

    public void setMemorias(String memorias) {
        this.memorias = memorias;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setMudancaDiscoRigido(int mudancaDiscoRigido) {
        this.mudancaDiscoRigido = mudancaDiscoRigido;
    }
    
    

    @Override
    public String toString() {
        return "Computador{" + "capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", SistemaOperacional=" + SistemaOperacional + ", memorias=" + memorias + ", processador=" + processador + ", situacao=" + situacao + ", mudancaDiscoRigido=" + mudancaDiscoRigido + '}';
    }

    
    
    
}
