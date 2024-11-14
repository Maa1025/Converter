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
public class DIstanceConverter {
    
    public static void convert(){
        double km;
        double distance = 1000; //Conversion factor km to meters
        Scanner input = new Scanner(System.in);
        
        //Distance COnverter
        System.out.print("Insert distance in km: ");
        km = input.nextDouble();
        double meters = (km*distance);
        System.out.println("Distance in meter: "+meters);
    }
}
