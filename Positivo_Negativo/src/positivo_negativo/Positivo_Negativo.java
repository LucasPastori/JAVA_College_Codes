/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivo_negativo;
import java.util.Scanner;

public class Positivo_Negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Insira o número");
        num = input.nextInt();
        
        String R = num >=0 ? "Positivo" : "Negativo";
        System.out.println("O número é " + R);
       
    }
    
}
