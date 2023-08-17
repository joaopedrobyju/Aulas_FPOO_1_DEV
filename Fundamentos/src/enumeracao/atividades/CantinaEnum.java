/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum CantinaEnum {
    
    COXINHA("Coxinha"),
    ENROLADINHO("Enroladinho"),
    ESFIHA("Esfiha"),
    SUCO_LARANJA("Suco de Laranja"),
    KIBE("Slagado de Kibe"),
    SUCO_UVA("Suco de Uva"),
    REFRIGERANTE("Refrigerante de Guaraná"),
    LANCHE("X-Tudo");
    
    private String produtos;
    
    private CantinaEnum(String produtos) {
        this.produtos = produtos;
    }
    
    public String getStatus(){
        return this.produtos;
    }
}
