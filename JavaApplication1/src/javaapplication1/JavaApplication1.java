/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n1, n2, n3, produto;
        System.out.println("Primeiro número: ");
        n1 = input.nextDouble();
        System.out.println("Segundo número: ");
        n2 = input.nextDouble();
        System.out.println("terceiro número: ");
        n3 = input.nextDouble();
        
        produto = n1 * n2 * n3;
        System.out.println("O produto dos números é: " + produto);
    }
    
}
