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
public class LengthConverter {
    
    public static void convert(){
        double meters;
        Scanner input = new Scanner(System.in);
        
        //Length Converter
        System.out.print("Insert length in meters:");
        meters = input.nextDouble();
        double feet = meters*3.28084; //conversion factor meter to feet
        System.out.println("Length in Feet: "+feet);
    }
}
