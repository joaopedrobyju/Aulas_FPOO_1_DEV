/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Aluno Jorge = new Aluno("Jorge Silva", "jorgeSilva@gmail.com", 123);
        
        Jorge.estuda("Estudando Materia de Matemática");
        
        Jorge.fazerProva("Para fazer prova de Matemática");
        
        System.out.println(Jorge);
    }
}
