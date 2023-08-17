/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario01","Usuario01@gmail.com", true, TipoUsuarioEnum.TECNICO);
        
        System.out.println(usuario);
        
        Pedido pedidos = new Pedido("Pedido usuario 01", 29.99, StatusEnum.EM_PREPARACAO.getStauts());
        System.out.println(pedidos);
        
        pedidos.setStatus(StatusEnum.EM_TRANSPORTE.getStauts());
        System.out.println(pedidos);
        
        pedidos.setStatus(StatusEnum.ENTEGUE.getStauts());
        System.out.println(pedidos);
    }
    
}
