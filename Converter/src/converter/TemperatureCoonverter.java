/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;


import java.util.Scanner;
/**
 *
 * @author USER
 */
public class TemperatureCoonverter {
    
    public static void convert(){
        double celcius;
        Scanner input = new Scanner(System.in);
        
        //Temperature Converter
        System.out.print("Insert temperature in celcius: ");
        celcius = input.nextDouble();
        double fahrenheit = (celcius*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
    }
}
