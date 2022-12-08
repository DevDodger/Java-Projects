/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

/**
 *
 * @author rmiller3226
 */
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        
        double fahrenheitTemp;
        int celsiusTemp = 24;
        
        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        
        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
    }
    
}
