/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexaconverted;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class NumberToBinaryConverted {

    private int number,remainder;
    Scanner scanner = new Scanner(System.in);    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            NumberToBinaryConverted obj = new NumberToBinaryConverted();
            obj.run();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
    
    private void run() {
        getInput();
    }
    
    private void getInput() {
        System.out.println("Ingrese el numero a convertir");
        number = scanner.nextInt();
        convertNumberToBinary(number);
    }    
    
    private void convertNumberToBinary(int number) {                

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number % 2; 
        convertNumberToBinary(number >> 1);
        System.out.print(remainder);
    }
}
