/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollingdice;

/**
 *
 * @author rmiller3226
 */
public class RollingDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Die die1, die2;
       int sum;
       
       die1 = new Die();
       die2 = new Die();
       
            die1.roll();
            die2.roll();
       
           System.out.println("Die One: " + die1 + ", Die Two: " + die2);
       
       die1.roll();
       die2.setFaceValue(4);
       
       System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        
       sum = die1.getFaceValue() + die2.getFaceValue();
       System.out.println("Sum: " + sum);
       
       sum = die1.roll() + die2.roll();
       System.out.println("Die One: " + die1 + ", Die Two: " + die2);
       System.out.println("New Sum: " + sum);

    }
}
