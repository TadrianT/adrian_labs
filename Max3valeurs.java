/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max3valeurs;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Max3valeurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Nous allons calculer le maximum de trois numeros");

        System.out.println();

        System.out.print("Premier numero: ");
        int a = sc.nextInt();

        System.out.print("Deuxieme numero: ");
        int b = sc.nextInt();

        System.out.print("Troisieme numero: ");
        int c = sc.nextInt();

        int max = calculMax3(a, b, c);

        System.out.println("Le maximum: " + max);

    }

//test changes
    
    public static int calculMax3(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

}
