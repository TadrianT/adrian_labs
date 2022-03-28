/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author adrian
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 0;
        int b = 1;
        int sum = a + b;

        System.out.print(" 0 1");
        
        while(sum<21){
            
            sum = a + b;
            System.out.print(" " +sum);
            a = b;
            b= sum;
            
        }
        
        System.out.println();

    }

}
