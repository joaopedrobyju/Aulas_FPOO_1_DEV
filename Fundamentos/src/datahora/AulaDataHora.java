/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datahora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author user
 */
public class AulaDataHora {
     public static void main(String[] args) {
        //Criar uma data com dia atual
        LocalDate hoje = LocalDate.now();
        
        //Criar uma data com dia e hora atual
        LocalDateTime agora = LocalDateTime.now();
        
        //Criar uma data especificando ano, mes, dia
        LocalDate diaNatalAnoAterior = LocalDate.of(2022, 12, 25);
        
        //Criar uma data especificando ano, mes, dia, hora e minuto
        LocalDateTime horarioCeiaNatalAnoAterior = LocalDateTime.of(2022,12,25,22,30);
        
        LocalDate dataFutura = hoje.plusDays(10);//Adicione 10 dias
        LocalDate dataPassada = hoje.minusDays(50);//Subtrai 50 dias
        
        //Se hoje < data futura: Retorna -1
        //Se hoje > data futura: Retorna 1
        //Se hoje == data futura: Retorna 0
        
        int comparaDatas = hoje.compareTo(dataFutura);
        System.out.println(comparaDatas);
        
        //Criar um padrão usando a classe DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatadaPadraoBr = hoje.format(formatter);
        System.out.println("Data Formatada: " + dataFormatadaPadraoBr);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dataFormatadaPadraoAmericano = hoje.format(formatter2);
        System.out.println("Data Formatada: " + dataFormatadaPadraoAmericano);
        
        String diaAnoNovo = "01/01/2024";
        LocalDate dataAltoNivel = LocalDate.parse(diaAnoNovo, formatter);
        System.out.println("Data alto nivel: " + dataAltoNivel);
        
        String data = "12/11/2023";
        DateFormat formatter3 = new SimpleDateFormat ("dd/MM/yyyy");
        
        Locale localeBrasil = Locale.of("pt", "BR");
        String mesPorExtenso = hoje.getMonth().getDisplayName(TextStyle.FULL, localeBrasil);
        String dataPorExtenso = String.format("Hoje é dia %d do mes %s, do ano %d", hoje.getDayOfMonth(), mesPorExtenso, hoje.getYear());
        System.out.println(dataPorExtenso);
        
        
        
        String diaHoje = String.format("Hoje é dia %d do mês %s do ano %d ",hoje.getDayOfMonth() , hoje.getMonth(), hoje.getYear()
        );
        
        
        
        
        
        System.out.println(diaHoje);
        
        System.out.println(hoje);
        System.out.println(diaNatalAnoAterior);
        System.out.println(agora);
        System.out.println(horarioCeiaNatalAnoAterior);
        
       
    }
}
