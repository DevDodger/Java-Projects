/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasmileage;

import java.util.Scanner;

/**
 *
 * @author rmiller3226
 */
public class GasMileage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miles;
        double gallons, mpg;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt();
        
        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();
        
        mpg = miles / gallons;
        
        System.out.println("Miles per gallon: " + mpg);
    }
    
}
