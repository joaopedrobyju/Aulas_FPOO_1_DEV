/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public interface ClassificacaoPosts {
    int COMUM = 1;
    int LEGAL = 3;
    int SUPER_LEGAL = 5;
    
    public int PostsComuns();
    public int PostsLegais();
    public int PostsSuperLegais();
}
