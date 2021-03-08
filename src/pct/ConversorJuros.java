/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class ConversorJuros {
    double c, i, n, j;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        //apresentação
        System.out.println("Conversor de juros 1.0");
        
        System.out.println("Calcule a taxa de juros que será cobrada utlizando a fórmula j = c * i * n / 100 inserindo os seguintes dados:");
        
        //entrada
        System.out.print("\nInsira o capital: ");
        double c = dados.nextInt();
        
        System.out.print("\nInsira a taxa de juros: ");
        double i = dados.nextInt();
        
        System.out.print("\nInsira o período de capitalização: ");
        double n = dados.nextInt();
        
        //processamento
        double j = c * i * n / 100;
        
        //saída de informações
        System.out.println("\nA taxa de juros é de R$" + j);
    }
    
}
