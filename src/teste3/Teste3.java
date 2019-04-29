/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste3;

import java.util.Scanner;

/**
 *
 * @author kikol
 */
public class Teste3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tec =new Scanner(System.in);
        
        System.out.println("Digite um número= ");
        int a = tec.nextInt();
        System.out.println("Digite um número= ");
        int b = tec.nextInt();
        
        int resposta = a * b;
        
        System.out.printf("O produto entre %d e %d é = %d ", a, b, resposta);
        
        
        System.out.println("Fiz uma mudança!!!");
        
    }
    
}
