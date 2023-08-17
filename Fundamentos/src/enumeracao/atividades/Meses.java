/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

import enumeracao.TipoUsuarioEnum;

/**
 *
 * @author Aluno
 */
public class Meses {
    private int mes_valor;
    private MesesEnum tipo;

    public Meses(int mes_valor, MesesEnum tipo) {
        this.mes_valor = mes_valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Meses{" + "mes_valor=" + mes_valor + ", tipo=" + tipo + '}';
    }

    
    
    
    
    
    
}
