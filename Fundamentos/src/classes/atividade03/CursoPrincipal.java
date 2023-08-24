/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade03;

/**
 *
 * @author Aluno
 */
public class CursoPrincipal {
    public static void main(String[] args) {
        Curso curso01 = new Curso("Jonas", "Administrar os negócios", CategoriaEnum.DEV.getCursos());
        System.out.println(curso01);
        
        System.out.println("-----------------------------");
        curso01.Reprovado(3);
        System.out.println(curso01);
    }
}
