/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

import java.util.Scanner;

/**
 *
 * @author rmiller3226
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c; 
        double discriminant, root1, root2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the coefficient of x squared: ");
        a = scan.nextInt();
                
        System.out.print("Enter the coefficient of x: ");
        b = scan.nextInt();
        
        System.out.print("Enter the constant: ");
        c = scan.nextInt();
        
        discriminant = Math.pow(b, 2) - (4 * a * c);
        root1 = ((-1 *b) + Math.sqrt (discriminant)) /  (2 * a);
        root2 = ((-1 *b) - Math.sqrt (discriminant)) /  (2 * a);
        
        System.out.println("Root #1: " + root1);
        System.out.println("Root #2: " + root2);


        
    }
    
}
